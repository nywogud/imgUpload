package com.jhl.service;

import java.util.List;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort5VO;

public interface sort5Service {

	public List<sort5VO> selectAll() throws Exception;

	public void insertImg(String imgTitle, String imgLocation) throws Exception;

	public int countImg() throws Exception;

	public List<sort5VO> selectImg(PagingVO vo) throws Exception;

}
