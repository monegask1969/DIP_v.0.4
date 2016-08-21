/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.service;

import com.so.dip.domain.UsersDAO;
import com.so.dip.domain.Users;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author moneg
 */
public class UsersServiceImpl implements UsersService{
 @Autowired
    private UsersDAO usersDao;

//    @Required
//    public void setUsersDao(UsersDAO usersDao) {
//        this.usersDao = usersDao;
//    }

    public UsersServiceImpl() {
//        usersDao = new UsersDAOImpl();
    }
    
    @Override
    public Users getById(int id) {
        Users u = null;
        try{
            u = usersDao.getById(id);
            if(u == null){
                throw new ODEException("such user is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - user does not exist");
            throw ex;
        }
        return u;
    }

    @Override
    public List<Users> getList() {
        List<Users> u = null;
        try{
            u = usersDao.getList();
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return u;
    }

    @Override
    public Users loadByUsername(String login) {
        Users u = null;
        try{
            u = usersDao.findByUsername(login);
            if(u == null){
                throw new ODEException("such user is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - user does not exist");
            throw ex;
        }
        return u;
    }   
    
    
}
