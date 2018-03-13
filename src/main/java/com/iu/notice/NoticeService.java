package com.iu.notice;

import javax.inject.Inject;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iu.point.PointDTO;

@Transactional
@Service
public class NoticeService {
	
	@Inject
	
	private NoticeDAO noticeDAO;
	
	public int Insert(NoticeDTO noticeDTO) throws Exception{
		noticeDAO.noticeInsert(noticeDTO);
		PointDTO pointDTO=new PointDTO();
		pointDTO.setNum(noticeDTO.getNum());
		pointDTO.setWriter(noticeDTO.getWriter());
		return noticeDAO.pointInsert(pointDTO);
	}
	
}
