package com.sudarshan.structural.bridge;

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Turn On: SamsungTV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off: SamsungTV");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Set Samsung TV Channel:"+number);
    }
}
