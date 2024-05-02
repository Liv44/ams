package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
	
	
	@GetMapping("/info")
	public String info()
	{
		return "info.html";
	}
	
	@GetMapping("/details")
	public String detailsFormation()
	{
		return "details.html";
	}
}
