package com.example.demo.services.models;

public class ErrorResponse {
    private String message;

    public ErrorResponse() {}
    public ErrorResponse(String msg) { this.message = msg; }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
