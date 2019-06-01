package com.example.SpringBootFindIndexDefaultConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/loginpage")
    public String loginpage(){
        return "loginpage.html";
    }

    /*@RequestMapping("/loginpage")
    public String loginpage2(){
        return "loginpage";
    }*/
}
