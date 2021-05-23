package com.jhl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jhl.dao.sort5DAO;
import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort5VO;

@Service
public class sort5ServiceImpl implements sort5Service {
	
	//sort3DAO를 주입받아 데이터를 가져온다.
	@Inject
	private sort5DAO sort5dao;

	//칼럼의 모든 데이터 호출
	public List<sort5VO> selectAll() throws Exception{
	
		return sort5dao.selectAll();
		
	}
	
	//이미지 정보를 디비에 저장한다.
	public void insertImg(String imgTitle, String imgLocation) throws Exception{
		sort5dao.insertImg(imgTitle, imgLocation);
	}
	
	//총 이미지 갯수를 호출한다.
	public int countImg() throws Exception{
		return sort5dao.countImg();
	}

	//페이징 처리 후 한 화면을 구성할 갯수만큼 이미지를 불러온다.
	public List<sort5VO> selectImg(PagingVO vo) throws Exception{
		return sort5dao.selectImg(vo);
	}
	
}
