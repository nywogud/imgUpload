package com.jhl.dao;

import java.util.List;
import com.jhl.sortDto.sort3VO;

public interface sort3DAO {
	
	//Į�� sort3�� ��� �̹����� �����´�.
	public List<sort3VO> selectAll() throws Exception;
	
	public void insertImg(String imgTitle, String imgLocation) throws Exception;
}