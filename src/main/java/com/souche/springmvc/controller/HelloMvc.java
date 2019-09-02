package com.souche.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: spring_mvc_dev
 * @ClassName: HelloMvc
 * @description: 欢迎mvc包结构实现类
 * @author: malin
 * @create: 2019-08-26 09:55
 **/
@Controller
public class HelloMvc {

    @GetMapping(value = "/helloMvc.json")
    @ResponseBody
    public String helloSpringMvcDemo(String str1) {
        return "hello spring mvc demo " + str1;
    }

    @GetMapping(value = "/helloJsp.html")
    public ModelAndView helloSpringMvcJsp(String str2) {
        ModelAndView modelAndView = new ModelAndView("jsp/hello");
        modelAndView.addObject("message", str2);
        return modelAndView;
    }

}
