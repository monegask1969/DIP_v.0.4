/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.service;

import com.so.dip.domain.DogShowDAO;
import com.so.dip.domain.Dogshow;
import java.sql.Blob;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author moneg
 */
public class DogShowServiceImpl implements DogShowService{
 @Autowired
    private DogShowDAO dogshowDao;
    
    @Override
    public Dogshow getById(int id) {
        Dogshow d = null;
        try{
            d = dogshowDao.getById(id);
            if(d == null){
                throw new ODEException("such dog show is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog show does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogshow getByTitle(String title) {
        Dogshow d = null;
        try{
            d = dogshowDao.getByTitle(title);
            if(d == null){
                throw new ODEException("such dog show is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog show does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogshow getByDate(Date date) {
        Dogshow d = null;
        try{
            d = dogshowDao.getByDate(date);
            if(d == null){
                throw new ODEException("such dog show is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog show does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogshow getBySponsor(String sponsor) {
        Dogshow d = null;
        try{
            d = dogshowDao.getBySponsor(sponsor);
            if(d == null){
                throw new ODEException("such dog show is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog show does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogshow getByPicture(Blob picture) {
        Dogshow d = null;
        try{
            d = dogshowDao.getByPicture(picture);
            if(d == null){
                throw new ODEException("such dog show is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog show does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogshow getByDescription(String description) {
        Dogshow d = null;
        try{
            d = dogshowDao.getByDescription(description);
            if(d == null){
                throw new ODEException("such dog show is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog show does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogshow getByAdress(String adress) {
        Dogshow d = null;
        try{
            d = dogshowDao.getByAdress(adress);
            if(d == null){
                throw new ODEException("such dog show is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog show does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public List<Dogshow> getList() {
         List<Dogshow> d = null;
        try{
            d = dogshowDao.getList();
            System.out.println(d.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return d;
    }
    
}
