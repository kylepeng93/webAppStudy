package com.linux4fun.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.linux4fun.exception.BookException;


@Controller
public class WebExceptionHandlingController {
	Logger logger  = LoggerFactory.getLogger(WebExceptionHandlingController.class);
	
	@GetMapping("/exception")
	public String helloException() {
		throw new BookException("查无此书");
	}
	/**
	 * 定义数据完整性异常处理方法
	 */
	@ResponseStatus(value=HttpStatus.CONFLICT, reason = "Data integrity violation")
	@ExceptionHandler(DataIntegrityViolationException.class)
	public void conflict() {
		
	}
	
	/**
	 * 处理指定的数据库异常
	 * @return
	 */
	@ExceptionHandler({SQLException.class, DataAccessException.class})
	public String databaseErr () {
		return "databaseError";
	}
	
	/**
	 * 用来处理没有指定异常处理方法的其他异常
	 * @param req
	 * @param ex
	 * @return
	 */
//	@ExceptionHandler(Exception.class)
//	public ModelAndView handleError(HttpServletRequest req, Exception ex) {
//		logger.error("Request:" + req.getRequestURL() + " raised " + ex);
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("exception", ex);
//		mav.addObject("url", req.getRequestURL());
//		mav.setViewName("error");
//		return mav;
//	}
	
	
}
