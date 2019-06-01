package com.example.Redirect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {

		SpringApplicationBuilder sab =new SpringApplicationBuilder(Application.class);
		//new SpringApplicationBuilder(Application.class).web(true).run(args);
		//String url = "http://localhost:"+8080;
		//java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		sab.headless(false).run(args);
	}

	@RequestMapping("/goto")
	public void index(HttpServletRequest req, HttpServletResponse response) throws IOException {
		//System.out.println(req.getScheme());          // http
		//System.out.println(req.getServerName());     // localhost
		//System.out.println(req.getServerPort());     // 8080
		//System.out.println(req.getContextPath());   //   /app
		//System.out.println(req.getServletPath());    //  /
		//System.out.println(req.getRequestURL());   //http://localhost:8080/
		String url = "http://localhost:"+8080;
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
	}

}
