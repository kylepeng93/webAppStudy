package com.linux4fun.exception;

public class BusinessException extends RuntimeException {
	
	private static final long serialVersionUID = 8915182106896910770L;

	public BusinessException(String message) {
		super(message);
	}

}
