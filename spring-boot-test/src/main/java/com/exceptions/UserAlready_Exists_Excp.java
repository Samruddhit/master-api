package com.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus( value=HttpStatus.BAD_REQUEST, reason="User already exists", value = 5968000547444142953L)
public class UserAlready_Exists_Excp extends Exception {
	
	private static final long serialVersionUID = 3932906165189258949L;

}
