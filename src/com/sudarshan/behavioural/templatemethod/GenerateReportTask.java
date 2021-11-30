package com.sudarshan.behavioural.templatemethod;

public class GenerateReportTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Generate report");
    }
}
