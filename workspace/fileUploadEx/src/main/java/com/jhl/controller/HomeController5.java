package com.jhl.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.jhl.service.sort5Service;
import com.jhl.sortDto.sort5VO;

@Controller
public class HomeController5 {

	@Inject
	private sort5Service sort5Service;

	@RequestMapping(value = "/sort5", method = RequestMethod.GET)
	public String home(Model model, @RequestParam(required = false, value = "msg") String msg) throws Exception {
		
		//������ �⺻ ������ Į�� 3��
		List<sort5VO> imgList = sort5Service.selectAll();
		
		model.addAttribute("imgList", imgList);
		
		//�⺻ Ȩ ȭ��
		return "home5";
		
				
	}
		
}