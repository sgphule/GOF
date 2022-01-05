package com.sudarshan.creational.abstractfactory.ant;

import com.sudarshan.creational.abstractfactory.Button;
import com.sudarshan.creational.abstractfactory.TextBox;
import com.sudarshan.creational.abstractfactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }

    @Override
    public Button createButton() {
        return new AntButton();
    }
}