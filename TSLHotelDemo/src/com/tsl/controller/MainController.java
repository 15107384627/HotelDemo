package com.tsl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/main")
	public String main() {
		return "main";
	}
	@RequestMapping(value="/main/top")
	public String top(){
		return "top";
	}
	@RequestMapping(value="/main/left")
	public String left(){
		return "left";
	}
	@RequestMapping(value="/main/index")
	public String index(){
		return "index";
	}
}
