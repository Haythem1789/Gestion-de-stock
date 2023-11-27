package com.jebali.gestiondestock.exception;

import lombok.Getter;

import java.util.List;

public class invalidEntityException extends  RuntimeException {

    @Getter
    private ErrorCodes errorCodes;
    @Getter
    private List<String> errors;

    public invalidEntityException(String message){
        super(message);
    }
    public invalidEntityException(String message, Throwable couses){
        super(message,couses);
    }
    public invalidEntityException(String message, Throwable couses, ErrorCodes errorcCodes) {
        super(message, couses);
        this.errorCodes = errorcCodes;
    }

    public invalidEntityException(String message, List<String> errors, ErrorCodes errorcCodes) {
        super(message);
        this.errorCodes = errorcCodes;
        this.errors = errors;
    }

}
