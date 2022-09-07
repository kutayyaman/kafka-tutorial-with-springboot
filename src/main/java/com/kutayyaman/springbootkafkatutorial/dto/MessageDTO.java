package com.kutayyaman.springbootkafkatutorial.dto;

public class MessageDTO {
    private String body;

    public MessageDTO(String body) {
        this.body = body;
    }

    public MessageDTO() {
        this.body = "default value";
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
