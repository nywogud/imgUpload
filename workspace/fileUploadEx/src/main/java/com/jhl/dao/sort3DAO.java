package com.jhl.dao;

import java.util.List;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort3VO;

public interface sort3DAO {
	
	//칼럼 sort3의 모든 이미지를 가져온다.
	public List<sort3VO> selectAll() throws Exception;
	
	//이미지를 저장한다.
	public void insertImg(String imgTitle, String imgLocation) throws Exception;
	
	//이미지의 총 갯수를 호출한다.
	public int countImg() throws Exception;
	
	//페이징 처리 후 한 화면을 구성할 갯수만큼의 이미지를 가져온다.
	public List<sort3VO> selectImg(PagingVO vo) throws Exception;
	
}
