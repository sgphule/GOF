package com.sudarshan.structural.bridge;

public class MainBridge {
    public static void main(String[] args){
        System.out.println("------------------------");
        var remoteCtrl = new RemoteControl(new SonyTV());
        remoteCtrl.turnOn();
        remoteCtrl.turnOff();
        System.out.println("------------------------");
        var adRemoteCtrl = new AdvancedRemoteControl(new SonyTV());
        adRemoteCtrl.turnOn();
        adRemoteCtrl.setChannel(11);
        adRemoteCtrl.turnOff();
        System.out.println("------------------------");
        var adRemote = new AdvancedRemoteControl((new SamsungTV()));
        adRemote.turnOn();
        adRemote.setChannel(22);
        adRemote.turnOff();
        System.out.println("------------------------");
    }
}
