package com.sudarshan;

import com.sudarshan.behavioural.iterator.BrowseHistory;
import com.sudarshan.behavioural.momento.Editor;
import com.sudarshan.behavioural.momento.History;
import com.sudarshan.behavioural.state.BrushTool;
import com.sudarshan.behavioural.state.Canvas;
import com.sudarshan.behavioural.state.EraserTool;
import com.sudarshan.behavioural.state.SelectionTool;
import com.sudarshan.behavioural.strategy.*;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("image1", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("image1", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
