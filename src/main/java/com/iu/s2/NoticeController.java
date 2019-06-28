package com.iu.s2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.notice.NoticeService;

@Controller
@RequestMapping(value = "/notice/")
public class NoticeController {
	
	private NoticeService noticeService;
	
	public NoticeController() {
		noticeService = new NoticeService();
	}
	

}
