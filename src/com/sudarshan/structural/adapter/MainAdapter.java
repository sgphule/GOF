package com.sudarshan.structural.adapter;

import com.sudarshan.structural.adapter.tpfilter.Caramel;

public class MainAdapter {
    public static void main(String[] args){
        var view = new ImageView(new Image());
        view.apply(new CaramelFilter(new Caramel()));
    }
}