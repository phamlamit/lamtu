package com.lam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrangChuController {
	
	@RequestMapping("/")
	
	public String viewTrangChu() {
		return "trangchu";
	}
	
	@RequestMapping("/login")
	public String viewLogin() {
		return "login";
	}

}
