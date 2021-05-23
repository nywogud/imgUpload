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

	// ������ ������ �����ϴ� mapper.xml�� ���� �����͸� �޾� �´�.
	public List<sort4VO> selectAll() throws Exception {

		return sqlSession.selectList(Namespace + ".selectAll");

	}

	//�̹��� ������ �����Ѵ�.
	public void insertImg(String imgTitle, String imgLocation) throws Exception {

		Map<String, String> paraMap = new HashMap<String, String>();
		paraMap.put("imgTitle", imgTitle);
		paraMap.put("imgLocation", imgLocation);
		sqlSession.insert(Namespace + ".insertImg", paraMap);
	}
	
	//�̹��� �� ������ ����Ѵ�.
	public int countImg() throws Exception {
		return sqlSession.selectOne(Namespace + ".countImg");
	}

	//����¡ ó�� �� �� ȭ���� ������ ������ŭ�� �̹����� �����´�.
	public List<sort4VO> selectImg(PagingVO vo) throws Exception{
		return sqlSession.selectList(Namespace + ".selectImg", vo);
	}
}
