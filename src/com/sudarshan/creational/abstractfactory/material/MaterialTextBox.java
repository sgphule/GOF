package com.sudarshan.creational.abstractfactory.material;

import com.sudarshan.creational.abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}