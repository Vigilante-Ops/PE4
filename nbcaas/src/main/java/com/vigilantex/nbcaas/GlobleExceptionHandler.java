package com.vigilantex.nbcaas;

import com.vigilantex.nbcaas.CustomExceptions.CustomValidationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobleExceptionHandler
{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String fieldValidationFailed(MethodArgumentNotValidException ex)
    {
        return "Valdation worked";
    }
    @ExceptionHandler(CustomValidationException.class)
    public String organisationIdValidationFailed(CustomValidationException ex)
    {
        return ex.getMessage();
    }

}
