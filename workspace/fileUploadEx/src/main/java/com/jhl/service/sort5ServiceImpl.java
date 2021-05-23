package com.jhl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jhl.dao.sort5DAO;
import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort5VO;

@Service
public class sort5ServiceImpl implements sort5Service {
	
	//sort3DAO�� ���Թ޾� �����͸� �����´�.
	@Inject
	private sort5DAO sort5dao;

	//Į���� ��� ������ ȣ��
	public List<sort5VO> selectAll() throws Exception{
	
		return sort5dao.selectAll();
		
	}
	
	//�̹��� ������ ��� �����Ѵ�.
	public void insertImg(String imgTitle, String imgLocation) throws Exception{
		sort5dao.insertImg(imgTitle, imgLocation);
	}
	
	//�� �̹��� ������ ȣ���Ѵ�.
	public int countImg() throws Exception{
		return sort5dao.countImg();
	}

	//����¡ ó�� �� �� ȭ���� ������ ������ŭ �̹����� �ҷ��´�.
	public List<sort5VO> selectImg(PagingVO vo) throws Exception{
		return sort5dao.selectImg(vo);
	}
	
}
