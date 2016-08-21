/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.service;

import com.so.dip.domain.Dogs;
import com.so.dip.domain.DogsDAO;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author moneg
 */
public class DogsServiceImpl implements DogsService{
    
        @Autowired
    private DogsDAO dogsDao;

    @Override
    public Dogs getById(int id) {
        Dogs d = null;
        try{
            d = dogsDao.getById(id);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByBreed(String breed) {
        Dogs d = null;
        try{
            d = dogsDao.getByBreed(breed);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByName(String name) {
        Dogs d = null;
        try{
            d = dogsDao.getByName(name);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByDob(Date dob) {
        Dogs d = null;
        try{
            d = dogsDao.getByDob(dob);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByChip(String chip) {
        Dogs d = null;
        try{
            d = dogsDao.getByChip(chip);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByBrand(String brand) {
        Dogs d = null;
        try{
            d = dogsDao.getByBrand(brand);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByPedigree(String pedigree) {
        Dogs d = null;
        try{
            d = dogsDao.getByPedigree(pedigree);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getBySire(String sire) {
        Dogs d = null;
        try{
            d = dogsDao.getBySire(sire);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByDam(String dam) {
        Dogs d = null;
        try{
            d = dogsDao.getByDam(dam);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByFCIgroup(int fcigoup) {
        Dogs d = null;
        try{
            d = dogsDao.getByFCIgroup(fcigoup);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByOFname(String ofname) {
        Dogs d = null;
        try{
            d = dogsDao.getByOFname(ofname);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dogs getByBFname(String bfname) {
        Dogs d = null;
        try{
            d = dogsDao.getByBFname(bfname);
            if(d == null){
                throw new ODEException("such dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public List<com.so.dip.domain.Dogs> getList() {
        List<Dogs> d = null;
        try{
            d = dogsDao.getList();
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return d;
    }
    
}
