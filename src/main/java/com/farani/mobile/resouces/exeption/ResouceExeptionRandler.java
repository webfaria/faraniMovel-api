package com.farani.mobile.resouces.exeption;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.farani.mobile.services.execeptions.ObjectNotFoundExeception;

@ControllerAdvice
public class ResouceExeptionRandler {

	@ExceptionHandler(ObjectNotFoundExeception.class)
	public ResponseEntity<StandardError> ObjectNotFound(ObjectNotFoundExeception e, HttpServletRequest request) {

		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(),
				System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}
