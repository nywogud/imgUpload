package com.jhl.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jhl.sortDto.PagingVO;
import com.jhl.sortDto.sort3VO;

@Repository
public class sort3DAOImp implements sort3DAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.jhl.mappers.sort3Mapper";

	// 모든 이미지를 가져온다.
	public List<sort3VO> selectAll() throws Exception {

		return sqlSession.selectList(Namespace + ".selectAll");

	}

	//이미지 정보를 저장한다.
	public void insertImg(String imgTitle, String imgLocation) throws Exception {

		Map<String, String> paraMap = new HashMap<String, String>();
		paraMap.put("imgTitle", imgTitle);
		paraMap.put("imgLocation", imgLocation);
		sqlSession.insert(Namespace + ".insertImg", paraMap);
	}

	//이미지 갯수를 호출한다.
	public int countImg() throws Exception {
		return sqlSession.selectOne(Namespace + ".countImg");
	}

	//페이징 처리 후 한 화면를 구성할 갯수의 이미지를 가져온다.
	public List<sort3VO> selectImg(PagingVO vo) throws Exception{
		return sqlSession.selectList(Namespace + ".selectImg", vo);
	}

}
