package com.jhl.controller;

import java.io.File;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jhl.service.sort3Service;
import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort3VO;

@Controller
public class UploardController3 {

	private static final String FILE_SERVER_PATH = "D:/img/sort3";
	
	@Inject
	sort3Service sort3Service;

	@RequestMapping(value = "/upload3", method = RequestMethod.POST)
	public String uploard(PagingVO vo,
			@RequestParam("uploadFile") MultipartFile file, Model model,
			@RequestParam(required = false, value = "msg") String msg,
			@RequestParam(value= "nowPage", required = false) String nowPage,
			@RequestParam(value= "cntPerPage", required = false) String cntPerPage)
			throws Exception {
		
			if(!(file.getOriginalFilename().isEmpty())){
				//ȭ�� �ܿ��� ������ �̹��� ���� ����
				file.transferTo(new File(FILE_SERVER_PATH, file.getOriginalFilename()));
				
				String imgTitle = file.getOriginalFilename();
				String imgLocation = FILE_SERVER_PATH + "/" + imgTitle;
				
				//ȭ��ܿ��� ������ �̹��� ���� DB ����.
				sort3Service.insertImg(imgTitle, imgLocation);
				
				//sort3�� �ִ� �̹��� �� ���� ȣ��
				int total = sort3Service.countImg();
				
				//���� �������� ������ �� �̹��� ���� ����, �⺻ 1������ �̹��� ������ 12��
				if(nowPage == null && cntPerPage==null) {
					nowPage = "1";
					cntPerPage = "12";
				}else if(nowPage == null) {
					nowPage = "1";
				}else if(cntPerPage == null) {
					cntPerPage = "12";
				}
				
				//PagingVO �����ڿ� �Ʒ� �Ķ��� �ְ� ��ü ����, ��ü�� ������ ����.
				vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
				//�� ��ü�� �㿡 ��ܿ� ����
				model.addAttribute("paging", vo);
				//�̹��� �� ����, ���� ������, ������ �� �̹��� ���� �Ķ����� ��� ��ȸ ����¡ �̹�������Ʈ ȣ��, ������ ����.
				List<sort3VO> imgList = sort3Service.selectImg(vo);
				//�� ��ü�� �㿡 ��ܿ� ����
				model.addAttribute("imgList",imgList);
				//�⺻ Ȩ ȭ��
				
				return "home";
			}else {
				//������ ���õ��� �ʾ��� ��� ����ó��.
				model.addAttribute("msg", "������ ���õ��� �ʾҽ��ϴ�.");
				
				//�Ʒ� ������ �� ������ ����.
				int total = sort3Service.countImg();
				
				if(nowPage == null && cntPerPage==null) {
					nowPage = "1";
					cntPerPage = "12";
				}else if(nowPage == null) {
					nowPage = "1";
				}else if(cntPerPage == null) {
					cntPerPage = "12";
				}
				
				vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
				model.addAttribute("paging", vo);
				List<sort3VO> imgList = sort3Service.selectImg(vo);
				model.addAttribute("imgList",imgList);
				return "home";
			}
		
	}
}
