package com.ihome.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequestMapping("/")
	public String index(HttpServletRequest request) {

		return "index";
	}
	
	@RequestMapping("/houseList")
	public String houseList(HttpServletRequest request) {

		return "index";
	}
	
	@RequestMapping("/saveHouse")
	public String saveHouse(HttpServletRequest request) {

		return "index";
	}

}
