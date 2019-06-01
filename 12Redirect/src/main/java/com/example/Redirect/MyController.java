package com.example.Redirect;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class MyController {

    @RequestMapping("/mytest")
    public void mytest(HttpServletResponse response) throws IOException {
        //response.setHeader("Location", "/test");
        //response.setStatus(302);
        response.sendRedirect("/");
    }

    @RequestMapping("/mytest2")
    public ModelAndView mytest2(){
        return new ModelAndView("index");
    }

    @RequestMapping("/mytest3")
    public RedirectView mytest3() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/");
        return redirectView;
    }

    @RequestMapping("/mytest4")
    public ResponseEntity<Object> mytest4() throws URISyntaxException {
        //return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("/homepage")).build();
        URI yahoo = new URI("/");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(yahoo);
        return new ResponseEntity<>("hello url",httpHeaders, HttpStatus.SEE_OTHER);
    }
}
