package com.paw.pawAdmin.exception;

import org.springframework.stereotype.Component;

@Component
public class CustomException extends Exception {

    public CustomException() {
        super();
    }

    public CustomException(String e) {
        super(e);
    }

    public CustomException(String e, Exception ex) {
        super(e, ex);
    }
}
