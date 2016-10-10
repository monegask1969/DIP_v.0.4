/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain;

import java.sql.Blob;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author moneg
 */
public class DogShowDAOImpl implements DogShowDAO{

    @Override
    public Dogshow getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByTitle(String title) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("title", title)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByDate(Date date) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("date", date)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getBySponsor(String sponsor) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("sponsor", sponsor)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByPicture(Blob picture) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("picture", picture)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByDescription(String description) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("description", description)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByAdress(String adress) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("adress", adress)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public List<Dogshow> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Dogshow.class); 
        List<Dogshow> dogshow = (List<Dogshow>)crit.list();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByOrganizer(String organizer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("organizer", organizer)).uniqueResult();
        session.close();
        return dogshow;
    }
    
}
