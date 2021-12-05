package com.sudarshan.behavioural.observer;

public class Chart implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Chart got notified "+value);
    }
}
