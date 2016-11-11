/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.web;

import com.so.dip.service.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author moneg
 */
@Controller
public class CreateDogController {
    @Autowired
    DogsService dogsService;
    
    @RequestMapping(value = {"/createdogpage"}, method = {RequestMethod.GET})
    public ModelAndView goToPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dogs/createdog");
        return mv;
    }
    
    @RequestMapping(value = {"/createdog"}, method = {RequestMethod.POST})
    public ModelAndView createDog(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dogs/createdog");
        return mv;
    }
}
