package com.gestion.microelectronica.exceptions.capacitor.electrolitico;

public class CapElectrIdMismatchException extends RuntimeException{
	
	public CapElectrIdMismatchException() {

	}

	public CapElectrIdMismatchException(String msj) {
		super(msj);
	}

	public CapElectrIdMismatchException(Throwable cause) {
		super(cause);
	}

	public CapElectrIdMismatchException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public CapElectrIdMismatchException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }

}
