package com.gestion.microelectronica.exceptions.transistor.bipolar;

public class TransistorBipolarNotFoundException extends RuntimeException{
	
	public TransistorBipolarNotFoundException() {

	}

	public TransistorBipolarNotFoundException(String msj) {
		super(msj);
	}

	public TransistorBipolarNotFoundException(Throwable cause) {
		super(cause);
	}

	public TransistorBipolarNotFoundException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public TransistorBipolarNotFoundException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }

}
