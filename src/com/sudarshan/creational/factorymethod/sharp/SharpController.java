package com.sudarshan.creational.factorymethod.sharp;

import com.sudarshan.creational.factorymethod.matcha.Controller;
import com.sudarshan.creational.factorymethod.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine getViewEngine() {
        return new SharpViewEngine();
    }
}
