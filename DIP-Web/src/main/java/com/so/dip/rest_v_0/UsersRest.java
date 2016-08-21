/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.rest_v_0;

import com.so.springwebapp.domain.Users;
import com.so.springwebapp.service.UsersService;
import java.util.List;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author moneg
 */
@Controller
//base - /rest/v_0/
public class UsersRest {
      @Autowired
    UsersService usersService;
    //users list {/users}  GET
    @RequestMapping(method = RequestMethod.GET,
            consumes = "text/plain", 
            produces = "application/json",
            path = "/rest/v_0/users")
    @ResponseBody
    public String getUsersList(){
        List<Users> users = usersService.getList();
        JSONArray arr = new JSONArray();
        for(Users u : users){
            arr.put(u.getJsonObject());
        }
        return arr.toString();
    }
    
    //createUser    {/user} POST
    
    //get userById  {/user/(id)}    GET 

    //updateUser(ById)  {/user/(id)} UPDATE

    //deleteById    {user/(id)} DELETE

    
    
}
