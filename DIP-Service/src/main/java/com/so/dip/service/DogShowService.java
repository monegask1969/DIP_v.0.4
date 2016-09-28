/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.service;

import com.so.dip.domain.Dogshow;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

/**
 *
 * @author moneg
 */
public interface DogShowService {
    Dogshow getById(int id);
    Dogshow getByTitle(String title);
    Dogshow getByDate(Date date);
    Dogshow getBySponsor(String sponsor);
    Dogshow getByPicture(Blob picture);
    Dogshow getByDescription(String description);
    Dogshow getByAdress(String adress);
    List<Dogshow> getList();
}
