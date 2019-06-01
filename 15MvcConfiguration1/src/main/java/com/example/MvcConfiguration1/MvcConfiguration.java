package com.example.MvcConfiguration1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfiguration {

    @Bean
    ViewResolver demo(){
        InternalResourceViewResolver view =new InternalResourceViewResolver();
        view.setPrefix("/view/");
        view.setSuffix(".jsp");
        return view;
    }

}
