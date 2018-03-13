package com.iu.s8;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice//프로젝트 내의 서버측 오류를 전부 처리
public class ExceptionController {
	
	@ExceptionHandler(NumberFormatException.class)
	public String test(){
		return "error/error404";
	}
	
	@ExceptionHandler(java.lang.ArithmeticException.class)
	public void test2(){
		ModelAndView mv=new ModelAndView();
		
	}
	
}
