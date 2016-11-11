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
import org.springframework.web.bind.annotation.PathVariable;
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
        List<Dogshow> dList = dogShowService.getList();
        mv.setViewName("dogs/dogshow");
        mv.addObject("dogshow",dList);
        System.out.println(dList);
        return mv;
    }
 
    
    @RequestMapping(value = "/views/dogs/dogshowdetails/${id}", method = {RequestMethod.GET})
    public ModelAndView getDogShowDetails(@PathVariable("id") Integer id){
        System.out.println("DOGSHOW");
        ModelAndView mv = new ModelAndView();
        System.out.println("getting dogshow list");
        List<Dogshow> dList = dogShowService.getList();
        mv.setViewName("dogs/dogshowdetails");
        mv.addObject("dogshowdet", dList.get(id));
        System.out.println(dList);
        return mv;
    }
}
