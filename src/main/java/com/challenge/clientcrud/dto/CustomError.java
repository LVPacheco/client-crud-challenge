package com.challenge.clientcrud.dto;

import java.time.Instant;

public class CustomError {
    private String path;
    private String message;
    private Instant timestamp;
    private Integer status;

    public CustomError(String path, String message, Instant timestamp, Integer status) {
        this.path = path;
        this.message = message;
        this.timestamp = timestamp;
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public String getMessage() {
        return message;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }
}
