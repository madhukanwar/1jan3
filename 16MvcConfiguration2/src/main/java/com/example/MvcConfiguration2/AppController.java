package com.example.MvcConfiguration2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String index(){
        return "redirect:/homepage";
    }

}
