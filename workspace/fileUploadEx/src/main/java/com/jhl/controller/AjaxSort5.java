package com.jhl.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhl.service.sort5Service;
import com.jhl.sortDto.sort5VO;

@Controller
public class AjaxSort5 {
	
	@Inject
	sort5Service sort5Service;

	@RequestMapping(value = "/ajaxSort5", method = RequestMethod.POST)
	@ResponseBody
	public List<sort5VO> ajaxSort3(@RequestParam("col") String col) throws Exception {

		List<sort5VO> sort5Result = sort5Service.selectAll();
		
		for(int i =0; i< sort5Result.size(); i++) {
			System.err.println(sort5Result.get(i).getImgTitle());
		}
		
		return sort5Result;
	}

}
