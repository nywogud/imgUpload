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

import com.jhl.service.sort4ServiceImpl;
import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort4VO;


@Controller
public class UploardController4 {

	private static final String FILE_SERVER_PATH = "D:/img/sort4";
	
	@Inject
	sort4ServiceImpl sort4Service;

	@RequestMapping(value = "/upload4", method = RequestMethod.POST)
	public String uploard(PagingVO vo,
			@RequestParam("uploadFile") MultipartFile file, Model model,
			@RequestParam(required = false, value = "msg") String msg,
			@RequestParam(value= "nowPage", required = false) String nowPage,
			@RequestParam(value= "cntPerPage", required = false) String cntPerPage)
			throws Exception {
		
			if(!(file.getOriginalFilename().isEmpty())){
				//ȭ��ܿ��� ������ �̹��� ���� ����.
				file.transferTo(new File(FILE_SERVER_PATH, file.getOriginalFilename()));
				
				String imgTitle = file.getOriginalFilename();
				String imgLocation = FILE_SERVER_PATH + "/" + imgTitle;
				
				//ȭ��ܿ��� ������ �̹��� ���� DB����.
				sort4Service.insertImg(imgTitle, imgLocation);
				
				//sort4�� �ִ� �̹��� �� ���� ȣ��
				int total = sort4Service.countImg();
				
				//���� �������� ������ �� �̹��� ���� ����, �⺻ 1������ �̹��� ������ 16��
				if(nowPage == null && cntPerPage==null) {
					nowPage = "1";
					cntPerPage = "16";
				}else if(nowPage == null) {
					nowPage = "1";
				}else if(cntPerPage == null) {
					cntPerPage = "16";
				}
				
				//PagingVO �����ڿ� �Ʒ� �Ķ��� �ְ� ��ü ����, ��ü�� ������ ����.
				vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
				//�� ��ü�� �㿡 ��ܿ� ����
				model.addAttribute("paging", vo);
				//�̹��� �� ����, ���� ������, ������ �� �̹��� ���� �Ķ����� ��� ��ȸ ����¡ �̹�������Ʈ ȣ��, ������ ����.
				List<sort4VO> imgList = sort4Service.selectImg(vo);
				//�� ��ü�� �㿡 ��ܿ� ����
				model.addAttribute("imgList",imgList);
				//�⺻ Ȩ ȭ��
				return "home4";
			}else {
				
				//������ ���õ��� �ʾ��� ��� ����ó��
				
				//sort4�� �ִ� �̹��� �� ���� ȣ��
				int total = sort4Service.countImg();
				
				//���� �������� ������ �� �̹��� ���� ����, �⺻ 1������ �̹��� ������ 16��
				if(nowPage == null && cntPerPage==null) {
					nowPage = "1";
					cntPerPage = "16";
				}else if(nowPage == null) {
					nowPage = "1";
				}else if(cntPerPage == null) {
					cntPerPage = "16";
				}
				
				//PagingVO �����ڿ� �Ʒ� �Ķ��� �ְ� ��ü ����, ��ü�� ������ ����.
				vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
				//�� ��ü�� �㿡 ��ܿ� ����
				model.addAttribute("paging", vo);
				//�̹��� �� ����, ���� ������, ������ �� �̹��� ���� �Ķ����� ��� ��ȸ ����¡ �̹�������Ʈ ȣ��, ������ ����.
				List<sort4VO> imgList = sort4Service.selectImg(vo);
				//�� ��ü�� �㿡 ��ܿ� ����
				model.addAttribute("imgList",imgList);
				model.addAttribute("msg", "������ ���õ��� �ʾҽ��ϴ�.");
				return "home4";
			}
		
	}
}
