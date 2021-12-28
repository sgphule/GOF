package com.sudarshan.structural.facade;

public class NotificationServer {
    public Connection connect(){
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key){
        return new AuthToken();
    }

    public void send(AuthToken token, Message message, String format){
        System.out.println("Sending a Message");
    }
}