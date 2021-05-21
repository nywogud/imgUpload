package com.jhl.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.jhl.service.sort3Service;
import com.jhl.sortDto.sort3VO;

@Controller
public class HomeController {
	
	@Inject
	private sort3Service sort3Service;
	
	//�⺻ ��Ʈ��  '/'
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, @RequestParam(required = false, value = "msg") String msg) throws Exception {
		
		//������ �⺻ ������ Į�� 3��
		List<sort3VO> imgList = sort3Service.selectAll();
		
		model.addAttribute("imgList", imgList);
		
		// ������ ÷������ �ʰ� ���ε� ��ư�� Ŭ���ϴ� ��� ���â �޽����� ���� model��ü�� Ȩȭ������ ����
		if(msg != null) {
			model.addAttribute("msg", msg);
			return "home";
		}
		//�⺻ Ȩ ȭ��
		else {
			return "home";
		}
					
	}
		
}