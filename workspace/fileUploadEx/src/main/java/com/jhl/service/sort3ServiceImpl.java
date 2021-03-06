package com.jhl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jhl.dao.sort3DAO;
import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort3VO;

@Service
public class sort3ServiceImpl implements sort3Service {

	// sort3DAO를 주입받아 데이터를 가져온다.
	@Inject
	private sort3DAO sort3dao;

	// 칼럼의 모든 데이터 호출
	public List<sort3VO> selectAll() throws Exception {

		return sort3dao.selectAll();

	}

	public void insertImg(String imgTitle, String imgLocation) throws Exception {
		sort3dao.insertImg(imgTitle, imgLocation);
	}

	public int countImg() throws Exception{
		return sort3dao.countImg();
	}

	public List<sort3VO> selectImg(PagingVO vo) throws Exception{
		return sort3dao.selectImg(vo);
	}

}
