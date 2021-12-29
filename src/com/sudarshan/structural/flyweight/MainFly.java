package com.sudarshan.structural.flyweight;

public class MainFly {
    public static void main(String[] args){
        var service = new PointService(new PointIconFactory());
        for(var point : service.getPoints()){
            point.draw();
        }
    }
}
