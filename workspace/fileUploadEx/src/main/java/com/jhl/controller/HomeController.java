package com.jhl.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


	// 기본 루트는 '/', sort3가 default
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() throws Exception {
	
		//기본 홈 화면은 sort3, 리다이렉트
		return "redirect:/sort3";
		
				
	}
		
}
