package com.example.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	 @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@Value("${test.name}") String name) {
        return "hello, " + name + "!";
    }
}