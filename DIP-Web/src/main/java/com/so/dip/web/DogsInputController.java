/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.web;

import com.so.dip.domain.Dogs;
import com.so.dip.service.DogsService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author moneg
 */
public class DogsInputController {
          @Autowired
    private DogsService dogsService;
          
              @RequestMapping(value = {"/dogsinput"}, method = {RequestMethod.GET})
    public ModelAndView getDogsList(){
        ModelAndView mv = new ModelAndView();
        List<Dogs> dList = dogsService.getList();
        mv.setViewName("dogs/dogs_input");
        mv.addObject("dogs", dList);
        return mv;
    }
    
        @RequestMapping(value = {"/dogs/{id}"}, method = {RequestMethod.POST})
    public String updateDog(
 @PathVariable("id")int id,
            @RequestParam(name = "FCI_group")int fci_group,
            @RequestParam(name = "breed")String breed,
            @RequestParam(name = "gender")String gender,
            @RequestParam(name = "name")String name,
            @RequestParam(name = "dob")Date dob,
            @RequestParam(name = "color")String color,
            @RequestParam(name = "chip")String chip,
            @RequestParam(name = "brand")String brand,
            @RequestParam(name = "pedigree")String pedigree,
            @RequestParam(name = "sire")String sire,
            @RequestParam(name = "dam")String dam,
            @RequestParam(name = "oLname")String oLname,
            @RequestParam(name = "ownerSCity")String ownerSCity,
            @RequestParam(name = "bLname")String bLname)
    {
        Dogs dog = dogsService.getById(id);
        dog.setFCIgroup(fci_group);
        dog.setBreed(breed);
        dog.setGender(gender);
        dog.setName(name);
        dog.setDob(dob);
        dog.setColor(color);
        dog.setChip(chip);
        dog.setBrand(brand);
        dog.setPedigree(pedigree);
        dog.setSire(sire);
        dog.setDam(dam);
        dog.setOLname(oLname);
        dog.setOwnerSCity(ownerSCity);
        dog.setBLname(bLname);
//        dogsService.updateDog(dog);
        return "redirect:/dogs";
    }
    @RequestMapping(value = {"/users/{id}"}, method = {RequestMethod.DELETE})
    @ResponseBody
    public void deleteUser(
            @PathVariable("id")int id){
        System.out.println("userid = " + id);
    }
    
}
