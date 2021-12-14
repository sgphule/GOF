package com.sudarshan.behavioural.chainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUname().equals("abc") && request.getPassword().equals("123"));
        System.out.println("Authenticate");
        return !isValid;
    }
}
