package com.jhl.dao;

import java.util.List;
import com.jhl.sortDto.sort4VO;

public interface sort4DAO {
	
	//Į�� sort4�� ��� �̹����� �����´�.
	public List<sort4VO> selectAll() throws Exception;
	
	public void insertImg(String imgTitle, String imgLocation) throws Exception;
}