package com.sudarshan.creational.abstractfactory.material;

import com.sudarshan.creational.abstractfactory.Button;
import com.sudarshan.creational.abstractfactory.TextBox;
import com.sudarshan.creational.abstractfactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }

    @Override
    public Button createButton() {
        return new MaterialButton();
    }
}
