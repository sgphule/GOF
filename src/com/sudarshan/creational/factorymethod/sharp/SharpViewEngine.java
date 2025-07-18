package com.sudarshan.creational.factorymethod.sharp;

import com.sudarshan.creational.factorymethod.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by sharp";
    }
}