package com.jhl.service;

import java.util.List;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort4VO;

public interface sort4Service {

	public List<sort4VO> selectAll() throws Exception;

	public void insertImg(String imgTitle, String imgLocation) throws Exception;

	public int countImg() throws Exception;

	public List<sort4VO> selectImg(PagingVO vo) throws Exception;
}
