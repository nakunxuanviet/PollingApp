package com.nakun.polls.exception;

public class ResourceNotFoundSimpleException extends RuntimeException {
    public ResourceNotFoundSimpleException(String message) {
        super(message);
    }

    public ResourceNotFoundSimpleException(String message, Throwable cause) {
        super(message, cause);
    }
}
