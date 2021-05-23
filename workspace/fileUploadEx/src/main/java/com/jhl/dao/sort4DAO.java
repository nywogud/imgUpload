package com.jhl.dao;

import java.util.List;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort4VO;

public interface sort4DAO {

	//Į�� sort4�� ��� �̹����� �ҷ��´�.
	public List<sort4VO> selectAll() throws Exception;

	//�̹��� ������ �����Ѵ�.
	public void insertImg(String imgTitle, String imgLocation) throws Exception;

	//�̹��� �� ������ �����´�.
	public int countImg() throws Exception;

	//����¡ ó�� �� �� ȭ���� ������ ������ŭ�� �̹����� �����´�.
	public List<sort4VO> selectImg(PagingVO vo) throws Exception;
}
