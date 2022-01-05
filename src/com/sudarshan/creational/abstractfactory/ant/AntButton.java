package com.sudarshan.creational.abstractfactory.ant;

import com.sudarshan.creational.abstractfactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
