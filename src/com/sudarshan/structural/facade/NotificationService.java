package com.sudarshan.structural.facade;

public class NotificationService {
    public void send(String message, String format) {
        var server = new NotificationServer();
        var connection = server.connect();
        var authToken = server.authenticate("AppId", "Key");
        server.send(authToken,new Message(message),format);
        connection.disconnect();
    }
}