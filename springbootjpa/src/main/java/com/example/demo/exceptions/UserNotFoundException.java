package com.example.demo.exceptions;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(Long id) {
		super("Could not found with the id "+id);
	}
}
