package com.employee.GlobalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> getExcept(NameNotFoundException ne){
		return new ResponseEntity<Object> (ne.getMessage(),HttpStatus.ALREADY_REPORTED);
	}
	@ExceptionHandler(SalaryNotFoundException.class)
	public ResponseEntity<Object>getExcept(SalaryNotFoundException ne){
		return new ResponseEntity<Object>(ne.getMessage(),HttpStatus.ALREADY_REPORTED);	}
	
	@ExceptionHandler(GenderNotFoundException.class)
	public ResponseEntity<Object>getExcept(GenderNotFoundException ne){
		return new ResponseEntity<Object>(ne.getMessage(),HttpStatus.ALREADY_REPORTED);	}
	
	@ExceptionHandler(ExperienceNotFoundException.class)
	public ResponseEntity<Object>getExcept(ExperienceNotFoundException ne){
		return new ResponseEntity<Object>(ne.getMessage(),HttpStatus.ALREADY_REPORTED);	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object>getExcept(IdNotFoundException ne){
		return new ResponseEntity<Object>(ne.getMessage(),HttpStatus.ALREADY_REPORTED);	}
	
}
