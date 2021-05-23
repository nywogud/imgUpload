package com.jhl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jhl.dao.sort4DAO;
import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort4VO;

@Service
public class sort4ServiceImpl implements sort4Service {
	
	//sort3DAO�� ���Թ޾� �����͸� �����´�.
	@Inject
	private sort4DAO sort4dao;

	//Į���� ��� ������ ȣ��
	public List<sort4VO> selectAll() throws Exception{
	
		return sort4dao.selectAll();
		
	}
	
	//�̹��� �μ�Ʈ
	public void insertImg(String imgTitle, String imgLocation) throws Exception{
		sort4dao.insertImg(imgTitle, imgLocation);
	}
	
	//�̹��� ���� Ȯ��
	public int countImg() throws Exception{
		return sort4dao.countImg();
	}

	//����¡ ���� �� �̹��� ����Ʈ ȣ��.
	public List<sort4VO> selectImg(PagingVO vo) throws Exception{
		return sort4dao.selectImg(vo);
	}
	
}
