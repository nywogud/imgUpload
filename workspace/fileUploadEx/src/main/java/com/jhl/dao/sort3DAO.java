package com.jhl.dao;

import java.util.List;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort3VO;

public interface sort3DAO {
	
	//Į�� sort3�� ��� �̹����� �����´�.
	public List<sort3VO> selectAll() throws Exception;
	
	//�̹����� �����Ѵ�.
	public void insertImg(String imgTitle, String imgLocation) throws Exception;
	
	//�̹����� �� ������ ȣ���Ѵ�.
	public int countImg() throws Exception;
	
	//����¡ ó�� �� �� ȭ���� ������ ������ŭ�� �̹����� �����´�.
	public List<sort3VO> selectImg(PagingVO vo) throws Exception;
	
}
