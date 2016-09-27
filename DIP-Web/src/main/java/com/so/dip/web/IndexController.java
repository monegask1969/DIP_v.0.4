package com.so.dip.web;

import com.so.dip.domain.Dogs;
import com.so.dip.domain.Users;
import com.so.dip.service.DogsService;
import com.so.dip.service.UsersService;
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
public class IndexController {
    @Autowired
    UsersService usersService;
    
    
    @RequestMapping(value = {"/home_page"}, method = {RequestMethod.GET})
    public ModelAndView getUsersList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dogs/home_page");
        return mv;
    }
    
//    
//    @RequestMapping(value = {"/users/{id}"}, method = {RequestMethod.GET})
//    public ModelAndView getUserById(
//            @PathVariable("id")int id){
//        ModelAndView mv = new ModelAndView();
//        Users user = usersService.getById(id);
//        mv.setViewName("users/editUser");
//        mv.addObject("user", user);
//        return mv;
//    }
//    
//    @RequestMapping(value = {"/users/{id}"}, method = {RequestMethod.POST})
//    public String updateUser(
//            @PathVariable("id")int id,
//            @RequestParam(name = "firstname")String firstname,
//            @RequestParam(name = "lastname")String lastname,
//            @RequestParam(name = "email")String email,
//            @RequestParam(name = "phone")String phone){
//        Users user = usersService.getById(id);
////        user.setFirstname(firstname);
////        user.setLastname(lastname);
////        user.setEmail(email);
////        user.setPhone(phone);
//        System.out.println(firstname);
////        usersService.updateUser(user);
//        return "redirect:/users";
//    }
//    @RequestMapping(value = {"/users/{id}"}, method = {RequestMethod.DELETE})
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
