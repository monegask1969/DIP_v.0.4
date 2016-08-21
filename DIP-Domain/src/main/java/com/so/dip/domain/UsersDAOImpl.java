/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author stan
 */
public class UsersDAOImpl implements UsersDAO{

    @Override
    public Users getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Users user = (Users)session.createCriteria(Users.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return user;
    }

    @Override
    public Users getByUsernameAndPassword(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Users> user = session.createCriteria(Users.class).list();
        session.close();
        return user;
    }

    @Override
    public Users findByUsername(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Users user = (Users)session.createCriteria(Users.class)
                .add(Restrictions.eq("login", username)).uniqueResult();
        System.out.println("user- " + user);
        session.close();
        return user;
    }
    
}
