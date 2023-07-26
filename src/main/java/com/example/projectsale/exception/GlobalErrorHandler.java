package com.example.projectsale.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<ErrorDto> handleModelNotFound(ModelNotFoundException ex, WebRequest request){
        ErrorDto dto = new ErrorDto(LocalDateTime.now(),ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> handleExceptions(Exception ex, WebRequest request){
        ErrorDto dto = new ErrorDto(LocalDateTime.now(),ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
