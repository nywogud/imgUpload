package com.jhl.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


	// �⺻ ��Ʈ�� '/', sort3�� default
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() throws Exception {
	
		//�⺻ Ȩ ȭ���� sort3, �����̷�Ʈ
		return "redirect:/sort3";
		
				
	}
		
}
