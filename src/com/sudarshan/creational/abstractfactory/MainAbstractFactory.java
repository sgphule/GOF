package com.sudarshan.creational.abstractfactory;

import com.sudarshan.creational.abstractfactory.ant.AntWidgetFactory;
import com.sudarshan.creational.abstractfactory.app.ContactForm;
import com.sudarshan.creational.abstractfactory.material.MaterialWidgetFactory;

public class MainAbstractFactory {
    public static void main(String[] args){
        new ContactForm().render(new AntWidgetFactory());
    }
}