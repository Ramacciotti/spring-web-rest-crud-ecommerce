package com.ramacciotti.ecommerce.adapter.inbound.exception;

import com.ramacciotti.ecommerce.domain.dto.exception.ErrorResponseDTO;
import com.ramacciotti.ecommerce.domain.exception.ItemNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleItemNotFoundException(ItemNotFoundException exception, HttpServletRequest request) {

        ErrorResponseDTO error = new ErrorResponseDTO(HttpStatus.NOT_FOUND.value(), exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);

    }

}
