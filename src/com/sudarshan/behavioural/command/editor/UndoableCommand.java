package com.sudarshan.behavioural.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
