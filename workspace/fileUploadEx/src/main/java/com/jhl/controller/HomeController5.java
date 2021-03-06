package com.jhl.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.jhl.service.sort5Service;
import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort5VO;

@Controller
public class HomeController5 {

	@Inject
	private sort5Service sort5Service;

	// 기본 루트는 '/', sort3가 default
		@RequestMapping(value = "/sort5", method = RequestMethod.GET)
		public String home(PagingVO vo, Model model, 
				@RequestParam(required = false, value = "msg") String msg,
				@RequestParam(value= "nowPage", required = false) String nowPage,
				@RequestParam(value= "cntPerPage", required = false) String cntPerPage
				) throws Exception {
			
			//sort3에 있는 이미지 총 갯수 호출
			int total = sort5Service.countImg();
			
			//현재 페이지와 페이지 당 이미지 갯수 지정, 기본 1페이지 이미지 갯수는 20개
			if(nowPage == null && cntPerPage==null) {
				nowPage = "1";
				cntPerPage = "20";
			}else if(nowPage == null) {
				nowPage = "1";
			}else if(cntPerPage == null) {
				cntPerPage = "20";
			}
			
			//PagingVO 생성자에 아래 파람을 넣고 객체 생성, 객체에 데이터 셋팅.
			vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
			//모델 객체에 담에 뷰단에 전달
			model.addAttribute("paging", vo);
			//이미지 총 개수, 현재 페이지, 페이지 당 이미지 수를 파람으로 디비 조회 페이징 이미지리스트 호출, 변수에 저장.
			List<sort5VO> imgList = sort5Service.selectImg(vo);
			//모델 객체에 담에 뷰단에 전달
			model.addAttribute("imgList",imgList);
			//기본 홈 화면
			return "home5";
			
		}
		
}
