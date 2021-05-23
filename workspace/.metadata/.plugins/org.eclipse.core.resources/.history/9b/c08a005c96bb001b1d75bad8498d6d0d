package com.jhl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jhl.dao.sort4DAO;
import com.jhl.sortDto.sort4VO;

@Service
public class sort4ServiceImpl implements sort4Service {
	
	//sort3DAO를 주입받아 데이터를 가져온다.
	@Inject
	private sort4DAO sort4dao;

	//칼럼의 모든 데이터 호출
	public List<sort4VO> selectAll() throws Exception{
	
		return sort4dao.selectAll();
		
	}
	
	public void insertImg(String imgTitle, String imgLocation) throws Exception{
		sort4dao.insertImg(imgTitle, imgLocation);
	}
	
}
