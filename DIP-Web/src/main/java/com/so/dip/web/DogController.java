package com.so.dip.web;

import java.util.Date;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stan
 */
@Controller
public class DogController {
//    @Autowired
//    DogsService dogsService;
    
    
//    @RequestMapping(value = {"/dogs"}, method = {RequestMethod.GET})
//    public ModelAndView getUsersList(){
//        ModelAndView mv = new ModelAndView();
//        List<Dogs> dList = dogsService.getList();
////        mv.setViewName("dogs/dogs_table");
//        mv.setViewName("dogs/dogs_input");
//        mv.addObject("dog", dList);
//        System.out.println(dList.get(0).getDob().toString());
//        System.out.println("DLIST");
//        System.out.println(dList);
//        return mv;
//    }
     

//    @RequestMapping(value = {"/dogs/{id}"}, method = {RequestMethod.GET})
//    public ModelAndView getUserById(
//            @PathVariable("id")int id){
//        ModelAndView mv = new ModelAndView();
//        Dogs dog = dogsService.getById(id);
//        mv.setViewName("dogs/dogs_table");
//        mv.addObject("d", dog);
//        return mv;
//    }
    
//@RequestMapping(value = {"/dogs"}, method = {RequestMethod.POST})
//    public String updateDog(
// @PathVariable("id")int id,
//            @RequestParam(name = "FCI_group")int fci_group,
//            @RequestParam(name = "breed")String breed,
//            @RequestParam(name = "gender")String gender,
//            @RequestParam(name = "name")String name,
//            @RequestParam(name = "dob")Date dob,
//            @RequestParam(name = "color")String color,
//            @RequestParam(name = "chip")String chip,
//            @RequestParam(name = "brand")String brand,
//            @RequestParam(name = "pedigree")String pedigree,
//            @RequestParam(name = "sire")String sire,
//            @RequestParam(name = "dam")String dam,
//            @RequestParam(name = "oLname")String oLname,
//            @RequestParam(name = "ownerSCity")String ownerSCity,
//            @RequestParam(name = "bLname")String bLname)
//    {
//        Dogs dog = dogsService.getById(id);
//        dog.setFcigroup(fci_group);
//        dog.setBreed(breed);
//        dog.setGender(gender);
//        dog.setName(name);
//        dog.setDob(dob);
//        dog.setColor(color);
//        dog.setChip(chip);
//        dog.setBrand(brand);
//        dog.setPedigree(pedigree);
//        dog.setSire(sire);
//        dog.setDam(dam);
//        dog.setOwnlname(oLname);
//        dog.setOwnerscity(ownerSCity);
//        dog.setBrelname(bLname);
////        dogsService.updateDog(dog);
//        return "redirect:/dogs";
//    }
//    @RequestMapping(value = {"/dogs"}, method = {RequestMethod.DELETE})
//    @ResponseBody
//    public void deleteUser(
//            @PathVariable("id")int id){
//        System.out.println("userid = " + id);
//    }
//    
//    @RequestMapping(value = {"/admin"}, method = {RequestMethod.GET})
//    public String admin(){
//        return "admin/admin";
//    }
    
}
