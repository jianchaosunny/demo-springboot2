package com.yinww.demo.springboot2.demo010.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping(value={"", "/", "index.html"})
    public ModelAndView index() {
        ModelAndView model = new ModelAndView();
        model.addObject("hi", "hi, springboot and thymeleaf");
        model.setViewName("index");
        return model;
    }

}
