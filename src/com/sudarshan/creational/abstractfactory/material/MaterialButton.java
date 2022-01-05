package com.sudarshan.creational.abstractfactory.material;

import com.sudarshan.creational.abstractfactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}