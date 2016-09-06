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
public class DogsTableController {
      @Autowired
    private DogsService dogsService;
    
    
    @RequestMapping(value = {"/dogstable"}, method = {RequestMethod.GET})
    public ModelAndView getDogsList(){
        ModelAndView mv = new ModelAndView();
        List<Dogs> dList = dogsService.getList();
        mv.setViewName("dogs/dogs_table");
        mv.addObject("dogs", dList);
        System.out.println("LISTTT");
        System.out.println(dList);
        return mv;
    }
     
    @RequestMapping(value = {"/dogs_table/{id}"}, method = {RequestMethod.GET})
    public ModelAndView getDogById(
            @PathVariable("id")int id){
        ModelAndView mv = new ModelAndView();
        Dogs dog = dogsService.getById(id);
        mv.setViewName("dogs/dogs_table");
        mv.addObject("dog", dog);
        return mv;
    }
    
    @RequestMapping(value = {"/dogs/{id}"}, method = {RequestMethod.POST})
    public String updateDog(
            @PathVariable("id")int id,
            @RequestParam(name = "FCI_group")String firstname,
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
//        user.setFirstname(firstname);
//        user.setLastname(lastname);
//        user.setEmail(email);
//        user.setPhone(phone);
//        usersService.updateUser(user);
        return "redirect:/dogs";
    }
    @RequestMapping(value = {"/dogs/{id}"}, method = {RequestMethod.DELETE})
    @ResponseBody
    public void deleteUser(
            @PathVariable("id")int id){
        System.out.println("userid = " + id);
    }
    
//    @RequestMapping(value = {"/admin"}, method = {RequestMethod.GET})
//    public String admin(){
//        return "admin/admin";
//    }
    
}