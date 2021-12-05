package com.sudarshan.behavioural.observer;

public class SpreadSheet implements Observer{
    DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void update() {
        System.out.println("Spreadsheet got notified " +dataSource.getValue());
    }
}
