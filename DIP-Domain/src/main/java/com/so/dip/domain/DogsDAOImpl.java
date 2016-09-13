/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author moneg
 */
public class DogsDAOImpl implements DogsDAO{

    @Override
    public Dogs getById(int id) {
               Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByBreed(String breed) {
               Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("breed", breed)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByName(String name) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("name", name)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByDob(Date dob) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("dob", dob)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByChip(String chip) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("chip", chip)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByBrand(String brand) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("brand", brand)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByPedigree(String pedigree) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("pedigree", pedigree)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getBySire(String sire) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("sire", sire)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByDam(String dam) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("dam", dam)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByFCIgroup(int fcigoup) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("fcigroup", fcigoup)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByOFname(String ofname) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("ofname", ofname)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dogs getByBFname(String bfname) {
                       Session session = HibernateUtil.getSessionFactory().openSession();
        Dogs dog = (Dogs)session.createCriteria(Dogs.class)
                .add(Restrictions.eq("bfname", bfname)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public List<Dogs> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Dogs.class); 
        List<Dogs> dog = (List<Dogs>)crit.list();
        session.close();
        return dog;
    }
    
}
