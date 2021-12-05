package com.sudarshan.behavioural.observer;

public class SpreadSheet implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified " +value);
    }
}
