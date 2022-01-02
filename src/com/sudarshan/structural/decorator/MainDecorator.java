package com.sudarshan.structural.decorator;

public class MainDecorator {
    public static void main(String[] args){
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    private static void storeCreditCard(Stream stream) {
        stream.write("123-456-789-000");
    }
}