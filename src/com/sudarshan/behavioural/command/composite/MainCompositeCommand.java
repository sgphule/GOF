package com.sudarshan.behavioural.command.composite;

public class MainCompositeCommand {
    public static void main(String[] args){
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();
    }
}
