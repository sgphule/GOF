package com.sudarshan.structural.bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Turn on: SonyTV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off: SonyTV");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Set Sony TV channel: "+number);
    }
}
