package com.jebali.gestiondestock.exception;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException {

    @Getter
    private ErrorCodes errorCodes;

    public EntityNotFoundException(String message){
        super(message);
    }
    public EntityNotFoundException(String message,Throwable couses){
        super(message,couses);
    }
    public  EntityNotFoundException(String message,Throwable couses,ErrorCodes errorCodes) {
        super(message, couses);
        this.errorCodes = errorCodes;
    }
    public  EntityNotFoundException(String message,ErrorCodes errorCodes) {
        super(message);
        this.errorCodes = errorCodes;

    }
}
