package com.sudarshan.behavioural.mediatorobserver;

public class TextBox extends UIControl{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
