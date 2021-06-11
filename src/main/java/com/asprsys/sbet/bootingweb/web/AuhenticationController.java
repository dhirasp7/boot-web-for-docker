package com.asprsys.sbet.bootingweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuhenticationController {
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

}
