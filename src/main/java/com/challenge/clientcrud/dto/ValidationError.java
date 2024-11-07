package com.challenge.clientcrud.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{
    private List<FieldMessage> errors = new ArrayList<FieldMessage>();

    public ValidationError(String path, String message, Instant timestamp, Integer status) {
        super(path, message, timestamp, status);
    }

    public void addError(String field, String message) {
        errors.add(new FieldMessage(field, message));
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

}
