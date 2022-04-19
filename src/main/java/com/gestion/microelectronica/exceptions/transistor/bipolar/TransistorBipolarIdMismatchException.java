package com.gestion.microelectronica.exceptions.transistor.bipolar;

public class TransistorBipolarIdMismatchException extends RuntimeException{

	public TransistorBipolarIdMismatchException() {

	}

	public TransistorBipolarIdMismatchException(String msj) {
		super(msj);
	}

	public TransistorBipolarIdMismatchException(Throwable cause) {
		super(cause);
	}

	public TransistorBipolarIdMismatchException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public TransistorBipolarIdMismatchException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }
	
}
