package com.sudarshan.creational.factorymethod;

import com.sudarshan.creational.factorymethod.matcha.Controller;
import com.sudarshan.creational.factorymethod.matcha.ViewEngine;
import com.sudarshan.creational.factorymethod.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController{ //Controller{
    public void listProducts(){
        //get products from database
        Map<String, Object> context = new HashMap<>();
        //context.put(products)
        render("products.html",context);
    }
}
