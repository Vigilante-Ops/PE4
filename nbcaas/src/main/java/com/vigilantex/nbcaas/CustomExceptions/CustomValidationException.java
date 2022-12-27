package com.vigilantex.nbcaas.CustomExceptions;

public class CustomValidationException extends RuntimeException{
    public CustomValidationException(String message) {
        super(message);
    }
}
