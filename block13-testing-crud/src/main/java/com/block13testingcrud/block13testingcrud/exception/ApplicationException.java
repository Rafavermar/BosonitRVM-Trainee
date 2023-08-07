package com.block13testingcrud.block13testingcrud.exception;

import org.springframework.http.HttpStatus;

public class ApplicationException extends RuntimeException {
    private final String externalMessage;
    private final HttpStatus statusCode;



    public ApplicationException(String externalMessage, HttpStatus statusCode) {
        this.externalMessage = externalMessage;
        this.statusCode = statusCode;
    }





    public String getExternalMessage() {
        return externalMessage;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }
}