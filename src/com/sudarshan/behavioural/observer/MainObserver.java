package com.sudarshan.behavioural.observer;

public class MainObserver {
    public static void main(String[] args){
        DataSource dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);
        dataSource.add(sheet1);
        dataSource.add(sheet2);
        dataSource.add(chart);
        dataSource.setValue(3);
    }
}
