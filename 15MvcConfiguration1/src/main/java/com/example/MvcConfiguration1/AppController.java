package com.example.MvcConfiguration1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String index(){
        return "page/index";
    }

}
