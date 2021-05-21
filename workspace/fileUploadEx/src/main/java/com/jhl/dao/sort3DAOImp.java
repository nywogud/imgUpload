package com.jhl.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jhl.sortDto.sort3VO;

@Repository
public class sort3DAOImp implements sort3DAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.jhl.mappers.sort3Mapper";

	// ������ ������ �����ϴ� mapper.xml�� ���� �����͸� �޾� �´�.
	public List<sort3VO> selectAll() throws Exception {

		return sqlSession.selectList(Namespace + ".selectAll");

	}

	public void insertImg(String imgTitle, String imgLocation) throws Exception {

		Map<String, String> paraMap = new HashMap<String, String>();
		paraMap.put("imgTitle", imgTitle);
		paraMap.put("imgLocation", imgLocation);
		sqlSession.insert(Namespace + ".insertImg", paraMap);
	}
}