/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author moneg
 */
public interface DogsDAO {
    Dogs getById(int id);
    Dogs getByBreed(String breed);
    Dogs getByName(String name);
    Dogs getByDob(Date dob);
    Dogs getByChip(String chip);
    Dogs getByBrand(String brand);
    Dogs getByPedigree(String pedigree);
    Dogs getBySire(String sire);
    Dogs getByDam(String dam);
    Dogs getByFCIgroup(int fcigoup);
    Dogs getByOFname(String ofname);
    Dogs getByBFname(String bfname);
    List<Dogs> getList();
}
