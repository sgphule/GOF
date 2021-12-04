package com.sudarshan.behavioural.command.composite;

import com.sudarshan.behavioural.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
