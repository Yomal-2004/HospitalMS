package com.example.demo.dto;

public class StandardResponse {
    private String code;
    private String message;
    private Object content; // can be List, Object, etc

    public StandardResponse(String code, String message, Object content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

    public String getCode() { return code; }
    public String getMessage() { return message; }
    public Object getContent() { return content; }
    // getters + setters
}