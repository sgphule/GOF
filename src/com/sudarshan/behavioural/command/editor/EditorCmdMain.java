package com.sudarshan.behavioural.command.editor;

public class EditorCmdMain {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        var history = new History();
        document.setContent("Hello GOF");
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
        var undo = new UndoCommand(history);
        undo.execute();
        System.out.println(document.getContent());

    }
}
