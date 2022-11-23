package com.toko.online.toko.online.exception;

import com.toko.online.toko.online.response.ResponHelper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> InternalEarror(NotFoundException notFoundException){
        return ResponHelper.error(notFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(InternalErrorException.class)
    public ResponseEntity<?> internalEarror(InternalErrorException internalErrorException){
        return ResponHelper.error(internalErrorException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}