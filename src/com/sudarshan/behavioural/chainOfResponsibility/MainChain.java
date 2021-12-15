package com.sudarshan.behavioural.chainOfResponsibility;

public class MainChain {
    public static void main(String[] args){
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        //var logger = new Logger(compressor);
        var authenticator= new Authenticator(compressor);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("abc", "123"));
    }
}