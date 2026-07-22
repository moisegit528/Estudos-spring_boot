package br.com.moisegit.Delivery_Local.handler;

import br.com.moisegit.Delivery_Local.dto.ErrorResponseDto;
import br.com.moisegit.Delivery_Local.exception.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
        public ResponseEntity<ErrorResponseDto> handleNotFoundException(NotFoundException exception){
        ErrorResponseDto response = ErrorResponseDto.builder()
                .message(exception.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
