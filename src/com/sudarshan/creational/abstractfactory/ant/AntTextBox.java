package com.sudarshan.creational.abstractfactory.ant;

import com.sudarshan.creational.abstractfactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
