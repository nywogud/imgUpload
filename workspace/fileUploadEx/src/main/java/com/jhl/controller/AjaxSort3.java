//package com.jhl.controller;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.jhl.service.sort3Service;
//import com.jhl.sortDto.sort3VO;
//
//@Controller
//public class AjaxSort3 {
//	
//	@Inject
//	sort3Service sort3Service;
//
//	@RequestMapping(value = "/sort3", method = RequestMethod.GET)
//	public List<sort3VO> ajaxSort3(Model model) throws Exception {
//
//		List<sort3VO> sort3Result = sort3Service.selectAll();
//		model.addAttribute(null, sort3Result);
//		for(int i =0; i< sort3Result.size(); i++) {
//			System.err.println(sort3Result.get(i).getImgTitle());
//		}
//		
//		return sort3Result;
//	}
//
//}
