package com.sudarshan.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }

    public void setChannel(int number){
        device.setChannel(number);
    }
}
