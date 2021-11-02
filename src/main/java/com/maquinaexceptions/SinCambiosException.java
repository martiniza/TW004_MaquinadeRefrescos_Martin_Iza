package com.maquinaexceptions;

public class SinCambiosException extends Exception {

	private double importeFalta;

	public SinCambiosException(String message, double importeFalta) {
		super(message);
		this.importeFalta = importeFalta;

	}

	public SinCambiosException(String message) {
		super(message);	
	}
}
