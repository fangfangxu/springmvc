package com.iot.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AAA {
    @RequestMapping("/a")
    public ModelAndView test(){
        ModelAndView mv=new ModelAndView();


        return mv;
    }
}
