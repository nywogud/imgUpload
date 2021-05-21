package com.jhl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jhl.dao.sort3DAO;
import com.jhl.sortDto.sort3VO;

@Service
public class sort3ServiceImpl implements sort3Service {
	
	//sort3DAO�� ���Թ޾� �����͸� �����´�.
	@Inject
	private sort3DAO sort3dao;

	//Į���� ��� ������ ȣ��
	public List<sort3VO> selectAll() throws Exception{
	
		return sort3dao.selectAll();
		
	}
	
	public void insertImg(String imgTitle, String imgLocation) throws Exception{
		sort3dao.insertImg(imgTitle, imgLocation);
	}
	
}