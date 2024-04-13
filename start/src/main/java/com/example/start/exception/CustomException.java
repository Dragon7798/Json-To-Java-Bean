package com.example.start.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomException {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<Object> custom(Exception exception) {
		Map<String, String> responseMap = new HashMap<>();

		responseMap.put("message", exception.getMessage());
		responseMap.put("status-code", "404");

		return new ResponseEntity<>(responseMap, HttpStatus.BAD_REQUEST);
	}

}
