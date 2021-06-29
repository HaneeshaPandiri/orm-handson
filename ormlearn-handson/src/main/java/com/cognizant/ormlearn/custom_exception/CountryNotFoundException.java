package com.cognizant.ormlearn.custom_exception;

@SuppressWarnings("serial")
public class CountryNotFoundException extends Exception {
	public CountryNotFoundException(String s){
		super(s);
	}
}
