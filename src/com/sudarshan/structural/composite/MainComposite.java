package com.sudarshan.structural.composite;

public class MainComposite {
    public static void main(String[] args){
        var group1 = new Group();
        group1.add(new Shape());  //circle
        group1.add(new Shape());  //circle

        var group2 = new Group();
        group2.add(new Shape());    //circle
        group2.add(new Shape());    //circle

        var group = new Group();
        group.add(group1);
        group.add(group2);

        group.render();
        group.move();
    }
}