package com.jhl.dao;

import java.util.List;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort5VO;

public interface sort5DAO {

	// Į�� sort5�� ��� �̹����� �����´�.
	public List<sort5VO> selectAll() throws Exception;

	//�̹��� ������ �����Ѵ�.
	public void insertImg(String imgTitle, String imgLocation) throws Exception;

	//�̹����l �� ������ ����Ѵ�.
	public int countImg() throws Exception;

	//����¡ ó�� �� �� ȭ���� ������ ��ŭ�� �̹��� ������ �ҷ��´�.
	public List<sort5VO> selectImg(PagingVO vo) throws Exception;

}
