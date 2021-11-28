package com.sudarshan;

import com.sudarshan.behavioural.momento.Editor;
import com.sudarshan.behavioural.momento.History;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("first line");
        history.push(editor.createState());

        editor.setContent("second line");
        history.push(editor.createState());

        editor.setContent("third line");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
