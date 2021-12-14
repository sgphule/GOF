package com.sudarshan.behavioural.chainOfResponsibility;

public class HttpRequest {
    private String uname;
    private String password;

    public HttpRequest(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    public String getUname() {
        return uname;
    }

    public String getPassword() {
        return password;
    }
}
