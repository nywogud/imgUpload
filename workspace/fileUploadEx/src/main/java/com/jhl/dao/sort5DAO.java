package com.jhl.dao;

import java.util.List;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort5VO;

public interface sort5DAO {

	// 칼럼 sort5의 모든 이미지를 가져온다.
	public List<sort5VO> selectAll() throws Exception;

	//이미지 정보를 저장한다.
	public void insertImg(String imgTitle, String imgLocation) throws Exception;

	//이미지릐 총 갯수를 출력한다.
	public int countImg() throws Exception;

	//페이징 처리 후 한 화면을 구성할 만큼의 이미지 갯수를 불러온다.
	public List<sort5VO> selectImg(PagingVO vo) throws Exception;

}
