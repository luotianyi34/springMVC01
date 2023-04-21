package com.xuhai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserinfoController {
    @RequestMapping("/list")
    public ModelAndView list(ModelAndView mv){
        /*默认控制的是request作用域*/
        mv.addObject("msg","success");
        mv.setViewName("/WEB-INF/pages/userinfo/userinfo-list.jsp");
        return mv;
    }

}
