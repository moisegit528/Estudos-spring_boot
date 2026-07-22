package br.com.moisegit.spring_boot_essentials.handler;

import br.com.moisegit.spring_boot_essentials.dto.ErrorResponse;
import br.com.moisegit.spring_boot_essentials.exception.BadRequestException;
import br.com.moisegit.spring_boot_essentials.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// utilizada para pegar as exceções que ocorrem no endpoint(@RestController).
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class) // faz a ponte da exceção "notfoundexception", quando ocorrer o erro, executa o metodo "@exceptionhandler"
    public ResponseEntity<ErrorResponse> handleBadRequestException(BadRequestException erro) {
        ErrorResponse response = ErrorResponse.builder()
                .message(erro.getMessage())
                .status(HttpStatus.BAD_REQUEST.toString())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }


    @ExceptionHandler(NotFoundException.class) // faz a ponte da exceção "notfoundexception", quando ocorrer o erro, executa o metodo "@exceptionhandler"
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException erro) {
        ErrorResponse response = ErrorResponse.builder()
                .message(erro.getMessage())
                .status(HttpStatus.NOT_FOUND.toString())
                .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
    @ExceptionHandler(Exception.class) // faz a ponte da exceção "notfoundexception", quando ocorrer o erro, executa o metodo "@exceptionhandler"
    public ResponseEntity<ErrorResponse> handleException(Exception erro) {
        ErrorResponse response = ErrorResponse.builder()
                .message(erro.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .build();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
