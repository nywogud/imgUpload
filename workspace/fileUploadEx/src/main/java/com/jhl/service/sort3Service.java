package com.jhl.service;

import java.util.List;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort3VO;

public interface sort3Service {
	
	

	public List<sort3VO> selectAll() throws Exception;

	public void insertImg(String imgTitle, String imgLocation) throws Exception;
	
	public int countImg()throws Exception;
	
	public List<sort3VO> selectImg(PagingVO vo) throws Exception;
	
	
}
