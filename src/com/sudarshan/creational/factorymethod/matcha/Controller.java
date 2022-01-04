package com.sudarshan.creational.factorymethod.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context){
        var engine = getViewEngine();
        var html = engine.render(viewName,context);
        System.out.println(html);
    }

    protected ViewEngine getViewEngine() {
        return new MatchaViewEngine();
    }
}