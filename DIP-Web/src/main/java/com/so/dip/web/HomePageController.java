/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.web;

import com.so.dip.service.UsersService;
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
public class HomePageController {
    
    
    @RequestMapping(value = {"/","/home_page"}, method = {RequestMethod.GET})
    public ModelAndView getHomePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dogs/home_page");
        return mv;
    }
}
