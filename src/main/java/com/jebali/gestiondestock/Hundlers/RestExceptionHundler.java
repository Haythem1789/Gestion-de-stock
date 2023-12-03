package com.jebali.gestiondestock.Hundlers;


import com.jebali.gestiondestock.exception.EntityNotFoundException;
import com.jebali.gestiondestock.exception.invalidEntityException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHundler extends ResponseEntityExceptionHandler {
@ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorDto> handleException(EntityNotFoundException exception , WebRequest webRequest){
    final HttpStatus notFound = HttpStatus.NOT_FOUND;
    final      ErrorDto errorDto =new ErrorDto().builder()
            .codes(exception.getErrorCodes())
            .httpcode(notFound.value())
            .message(exception.getMessage())
            .build();
    return new  ResponseEntity<>(errorDto,notFound);
}

    @ExceptionHandler(invalidEntityException.class)
    public ResponseEntity<ErrorDto> handleException(invalidEntityException exception , WebRequest webRequest){
        final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        final ErrorDto errorDto =new ErrorDto().builder()
                .codes(exception.getErrorCodes())
                .httpcode(badRequest.value())
                .message(exception.getMessage())
                .build();
        return new  ResponseEntity<>(errorDto,badRequest);
    }
}
