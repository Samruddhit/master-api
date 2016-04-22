package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//Sample for reference
@EnableAutoConfiguration
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "",method = RequestMethod.POST,consumes = MediaType.ALL_VALUE)
@ResponseBody
	public String hello(@RequestBody String name){
		
		return " Hello controller"+name;
	}
public static void main(String[] args) {
	SpringApplication.run(HelloController.class, args);
}
}
