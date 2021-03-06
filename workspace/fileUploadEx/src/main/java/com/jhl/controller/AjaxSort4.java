package com.jhl.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhl.service.sort4Service;
import com.jhl.sortDto.sort4VO;

@Controller
public class AjaxSort4 {
	
	@Inject
	sort4Service sort4Service;

	@RequestMapping(value = "/ajaxSort4", method = RequestMethod.POST)
	@ResponseBody
	public List<sort4VO> ajaxSort4(@RequestParam("col") String col) throws Exception {

		List<sort4VO> sort4Result = sort4Service.selectAll();
		
		for(int i =0; i< sort4Result.size(); i++) {
			System.err.println(sort4Result.get(i).getImgTitle());
		}
		
		return sort4Result;
	}

}
