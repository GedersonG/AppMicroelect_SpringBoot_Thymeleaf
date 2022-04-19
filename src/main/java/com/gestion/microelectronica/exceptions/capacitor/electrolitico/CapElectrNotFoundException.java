package com.gestion.microelectronica.exceptions.capacitor.electrolitico;

public class CapElectrNotFoundException extends RuntimeException{
	
	
	public CapElectrNotFoundException() {

	}

	public CapElectrNotFoundException(String msj) {
		super(msj);
	}

	public CapElectrNotFoundException(Throwable cause) {
		super(cause);
	}

	public CapElectrNotFoundException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public CapElectrNotFoundException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }
}
