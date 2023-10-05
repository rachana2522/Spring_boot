package com.cozentus.SpringBootApp.Test;

public class Bean {
	private String  message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return  String.format("Hello dear welcome my bean{message=%s}",message) ;
	}

	public Bean(String message) {
		this.message = message;
	}

	
	

}
