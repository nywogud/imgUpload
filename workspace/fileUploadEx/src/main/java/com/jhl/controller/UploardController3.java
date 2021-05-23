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
				//화면 단에서 선택한 이미지 로컬 저장
				file.transferTo(new File(FILE_SERVER_PATH, file.getOriginalFilename()));
				
				String imgTitle = file.getOriginalFilename();
				String imgLocation = FILE_SERVER_PATH + "/" + imgTitle;
				
				//화면단에서 선택한 이미지 정보 DB 저장.
				sort3Service.insertImg(imgTitle, imgLocation);
				
				//sort3에 있는 이미지 총 갯수 호출
				int total = sort3Service.countImg();
				
				//현재 페이지와 페이지 당 이미지 갯수 지정, 기본 1페이지 이미지 갯수는 12개
				if(nowPage == null && cntPerPage==null) {
					nowPage = "1";
					cntPerPage = "12";
				}else if(nowPage == null) {
					nowPage = "1";
				}else if(cntPerPage == null) {
					cntPerPage = "12";
				}
				
				//PagingVO 생성자에 아래 파람을 넣고 객체 생성, 객체에 데이터 셋팅.
				vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
				//모델 객체에 담에 뷰단에 전달
				model.addAttribute("paging", vo);
				//이미지 총 개수, 현재 페이지, 페이지 당 이미지 수를 파람으로 디비 조회 페이징 이미지리스트 호출, 변수에 저장.
				List<sort3VO> imgList = sort3Service.selectImg(vo);
				//모델 객체에 담에 뷰단에 전달
				model.addAttribute("imgList",imgList);
				//기본 홈 화면
				
				return "home";
			}else {
				//파일이 선택되지 않았을 경우 예외처리.
				model.addAttribute("msg", "파일이 선택되지 않았습니다.");
				
				//아래 로직은 위 로직과 동일.
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
