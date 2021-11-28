package com.sudarshan;

import com.sudarshan.behavioural.momento.Editor;
import com.sudarshan.behavioural.momento.History;
import com.sudarshan.behavioural.state.BrushTool;
import com.sudarshan.behavioural.state.Canvas;
import com.sudarshan.behavioural.state.EraserTool;
import com.sudarshan.behavioural.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
