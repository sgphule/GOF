package com.sudarshan.creational.singleton;

public class MainSingleton {
    public static void main(String[] args){
        var manager = ConfigManager.getInstance();
        manager.set("name","sudarshan");
        var other = ConfigManager.getInstance();
        System.out.println(other.get("name"));

    }
}
