package com.jhl.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jhl.sortDto.sort5VO;

@Repository
public class sort5DAOImp implements sort5DAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.jhl.mappers.sort5Mapper";

	// 데이터 쿼리를 실행하는 mapper.xml로 부터 데이터를 받아 온다.
	public List<sort5VO> selectAll() throws Exception {

		return sqlSession.selectList(Namespace + ".selectAll");

	}

	public void insertImg(String imgTitle, String imgLocation) throws Exception {

		Map<String, String> paraMap = new HashMap<String, String>();
		paraMap.put("imgTitle", imgTitle);
		paraMap.put("imgLocation", imgLocation);
		sqlSession.insert(Namespace + ".insertImg", paraMap);
	}
}
