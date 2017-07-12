package com.synnex.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@SpringBootApplication
@RequestMapping("/spring-boot-start")
public class SpringBootTestApplication {

	@RequestMapping("/index")
	public String test(){

		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
}
