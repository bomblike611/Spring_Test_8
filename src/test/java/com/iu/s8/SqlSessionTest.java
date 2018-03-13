package com.iu.s8;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.iu.notice.NoticeDTO;
import com.iu.notice.NoticeService;

public class SqlSessionTest extends AbstractTest {

	@Inject
	private SqlSession SqlSession;
	
	@Inject
	private NoticeService NoticeService;
	
	@Test
	public void test() {
		NoticeDTO noticeDTO=new NoticeDTO();
		noticeDTO.setContents("444444444444444444444444444444444444");
		noticeDTO.setTitle("44444444444444444444444444444444444444");
		noticeDTO.setWriter("44444444444444444444444444444444444444444");
		
		try {
			NoticeService.Insert(noticeDTO);
			System.out.println("Finish");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(SqlSession);
	}

}
