package com.sudarshan.creational.abstractfactory.app;

import com.sudarshan.creational.abstractfactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
