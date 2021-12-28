package com.sudarshan.structural.facade;

public class MainFasad {
    public static void main(String[] args){
        var service = new NotificationService();
        service.send("my message", "format");
    }
}