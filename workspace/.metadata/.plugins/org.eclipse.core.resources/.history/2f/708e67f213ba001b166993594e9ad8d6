package com.jhl.controller;

import java.io.File;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class UploardController5 {

	private static final String FILE_SERVER_PATH = "D:/img/sort5";
	
	@Inject
	com.jhl.service.sort5Service sort5Service;

	@RequestMapping(value = "/upload5", method = RequestMethod.POST)
	public String uploard(@RequestParam("uploadFile") MultipartFile file, Model model
			,RedirectAttributes redirect)
			throws Exception {
		
			if(!(file.getOriginalFilename().isEmpty())){
				file.transferTo(new File(FILE_SERVER_PATH, file.getOriginalFilename()));
				
				String imgTitle = file.getOriginalFilename();
				String imgLocation = FILE_SERVER_PATH + "/" + imgTitle;
				
				sort5Service.insertImg(imgTitle, imgLocation);
				
				return "redirect:/";
			}else {
				redirect.addFlashAttribute("msg", "파일이 선택되지 않았습니다.");
				return "redirect:/";
			}
		
	}
}
