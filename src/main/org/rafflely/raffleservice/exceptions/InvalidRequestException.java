package org.rafflely.raffleservice.exceptions;

public class InvalidRequestException extends RuntimeException {

    private static final long serialVersionUID = -5721215520198075994L;

    public InvalidRequestException() { super(); }

    public InvalidRequestException(String message) { super(message); }

    public InvalidRequestException(String message, Throwable cause) { super(message, cause); }

    public InvalidRequestException(Throwable cause) { super(cause); }

    public InvalidRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

