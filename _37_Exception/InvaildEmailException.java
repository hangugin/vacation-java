package com.study._37_Exception;

public class InvaildEmailException extends RuntimeException {

    public InvaildEmailException(String message) {
        super(message);
    }
}
