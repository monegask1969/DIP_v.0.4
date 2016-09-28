/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.web;

import com.so.dip.domain.Dogshow;
import com.so.dip.service.DogShowService;
import java.util.List;
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
public class DogShowController {
            @Autowired
    DogShowService dogShowService;
            
                @RequestMapping(value = {"/dogshow"}, method = {RequestMethod.GET})
    public ModelAndView getDogShow(){
        ModelAndView mv = new ModelAndView();
        List<Dogshow> dshList = dogShowService.getList();
//        mv.setViewName("dogs/dogs_table");
System.out.println("DOGSHOW");
        mv.setViewName("dogs/dogshow");
        mv.addObject("dogshow", dshList);
        System.out.println(dshList);
        return mv;
    }
    
}