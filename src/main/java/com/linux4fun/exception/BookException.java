package com.linux4fun.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "没有这本书哦")
public class BookException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 854108843575538988L;

	public BookException(String message) {
        super(message);
    }
}
