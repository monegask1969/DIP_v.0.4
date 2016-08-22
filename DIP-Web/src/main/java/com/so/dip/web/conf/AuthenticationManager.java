/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.web.conf;


import com.so.dip.domain.Users;
import com.so.dip.service.ODEException;
import com.so.dip.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service("userDetailsService")
public class AuthenticationManager implements UserDetailsService {
    
    @Autowired
    private UsersService usersService;



    // this class is used by spring controller to authenticate and authorize user
    @Override
    public UserDetails loadUserByUsername(String login)
                                          throws UsernameNotFoundException {
        System.err.println("auth with username "+login);
        UserDetails user = null;
        System.out.println("service " + usersService);
        try{
            user = (UserDetails)usersService.loadByUsername(login);
            if(user == null){
                throw new IllegalStateException("user is null");
            }
            System.out.println("user - "+user);
        }catch(ODEException ex){
            throw new BadCredentialsException("such user not found");
        }
        return user;
    }

   
}
