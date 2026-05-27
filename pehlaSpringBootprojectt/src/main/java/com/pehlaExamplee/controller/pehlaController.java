package com.pehlaExamplee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pehlaController {
	
	@RequestMapping("/")
	public String indexpage()
	{
		return "index";
	}
	@RequestMapping("/welcome")
	public String welcomePage()
	{
		return "welcome";
	}


}
