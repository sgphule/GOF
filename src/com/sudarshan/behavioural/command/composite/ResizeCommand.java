package com.sudarshan.behavioural.command.composite;

import com.sudarshan.behavioural.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
