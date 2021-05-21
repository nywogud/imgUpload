package com.jhl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jhl.dao.sort5DAO;
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
	
	public void insertImg(String imgTitle, String imgLocation) throws Exception{
		sort5dao.insertImg(imgTitle, imgLocation);
	}
	
}
