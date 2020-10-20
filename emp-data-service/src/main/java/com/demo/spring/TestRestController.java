package com.demo.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	
	@RequestMapping(path = "/info",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String info() {
		return "this is a rest application";
	}
	//http://localhost:8080/greet/kush   hence name-->kush
	@RequestMapping(path = "/greet/{name}",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String greet(@PathVariable("name") String name) {
		return name+"Welcome to spring REST Services";
	}
	
}
