package com.challenge.oop.infrastructure.configuration;

import com.challenge.oop.domain.model.dto.response.ErrorResponseDTO;
import com.challenge.oop.domain.model.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public final ResponseEntity<ErrorResponseDTO> handleUserNotFoundException(BusinessException ex, WebRequest request) {
        ErrorResponseDTO error = new ErrorResponseDTO(ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
