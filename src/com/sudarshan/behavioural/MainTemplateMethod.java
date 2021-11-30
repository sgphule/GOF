package com.sudarshan.behavioural;

import com.sudarshan.behavioural.templatemethod.TransferMoneyTask;

public class MainTemplateMethod {
    public static void main(String[] args){
        var task = new TransferMoneyTask();
        task.execute();
    }
}
