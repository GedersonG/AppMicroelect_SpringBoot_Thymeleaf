package com.gestion.microelectronica.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.gestion.microelectronica.exceptions.capacitor.electrolitico.CapElectrNotFoundException;
import com.gestion.microelectronica.exceptions.componente.ComponenteNotFoundException;
import com.gestion.microelectronica.exceptions.componente.detalle.ComponenteDetalleNotFoundException;
import com.gestion.microelectronica.exceptions.transistor.bipolar.TransistorBipolarNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ComponenteNotFoundException.class})
    protected ResponseEntity<Object> ComponenteHandleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Componente No Encontrado ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
    
    @ExceptionHandler({ComponenteDetalleNotFoundException.class})
    protected ResponseEntity<Object> ComponenteDetalleHandleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Componente Detalle No Encontrado ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
    
    @ExceptionHandler({CapElectrNotFoundException.class})
    protected ResponseEntity<Object> CapacitorElectroliticoHandleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Capacitor Electrolitico No Encontrado ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
    
    @ExceptionHandler({TransistorBipolarNotFoundException.class})
    protected ResponseEntity<Object> TransistorBipolarHandleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Transistor Bipolar No Encontrado ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
    
}
