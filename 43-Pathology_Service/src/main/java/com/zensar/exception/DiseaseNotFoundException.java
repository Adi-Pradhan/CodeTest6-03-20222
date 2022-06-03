package com.zensar.exception;

public class DiseaseNotFoundException extends RuntimeException{

private static final long serialVersionUTD=1L;
	
	public DiseaseNotFoundException(String message) {
		super(message);
	}
}
