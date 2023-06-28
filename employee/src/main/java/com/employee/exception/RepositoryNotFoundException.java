package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RepositoryNotFoundException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;

    public RepositoryNotFoundException(String message) {
        super(message);
    }
}
