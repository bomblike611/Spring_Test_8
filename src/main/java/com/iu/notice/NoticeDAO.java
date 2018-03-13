package com.iu.notice;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.iu.point.PointDTO;
@Repository
public class NoticeDAO {
	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE="NoticeMapper.";
	
	
	public int noticeInsert(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"noticeInsert", noticeDTO);
	}
	public int pointInsert(PointDTO pointDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"pointInsert", pointDTO);
	}
	
}
