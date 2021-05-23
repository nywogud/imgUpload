package com.jhl.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort4VO;

@Repository
public class sort4DAOImp implements sort4DAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.jhl.mappers.sort4Mapper";

	// 데이터 쿼리를 실행하는 mapper.xml로 부터 데이터를 받아 온다.
	public List<sort4VO> selectAll() throws Exception {

		return sqlSession.selectList(Namespace + ".selectAll");

	}

	//이미지 정보를 저장한다.
	public void insertImg(String imgTitle, String imgLocation) throws Exception {

		Map<String, String> paraMap = new HashMap<String, String>();
		paraMap.put("imgTitle", imgTitle);
		paraMap.put("imgLocation", imgLocation);
		sqlSession.insert(Namespace + ".insertImg", paraMap);
	}
	
	//이미지 총 갯수를 출력한다.
	public int countImg() throws Exception {
		return sqlSession.selectOne(Namespace + ".countImg");
	}

	//페이징 처리 후 한 화면을 구성할 갯수만큼의 이미지를 가져온다.
	public List<sort4VO> selectImg(PagingVO vo) throws Exception{
		return sqlSession.selectList(Namespace + ".selectImg", vo);
	}
}
