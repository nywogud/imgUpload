package com.jhl.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.jhl.service.sort4Service;
import com.jhl.sortDto.sort4VO;

@Controller
public class HomeController4 {

	@Inject
	private sort4Service sort4Service;

	// sort4
	@RequestMapping(value = "/sort4", method = RequestMethod.GET)
	public String home(Model model, @RequestParam(required = false, value = "msg") String msg) throws Exception {
		
		List<sort4VO> imgList = sort4Service.selectAll();
		
		model.addAttribute("imgList", imgList);
		
		return "home4";
		
				
	}
		
}
