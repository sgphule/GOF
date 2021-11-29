package com.sudarshan;

import com.sudarshan.behavioural.iterator.BrowseHistory;
import com.sudarshan.behavioural.momento.Editor;
import com.sudarshan.behavioural.momento.History;
import com.sudarshan.behavioural.state.BrushTool;
import com.sudarshan.behavioural.state.Canvas;
import com.sudarshan.behavioural.state.EraserTool;
import com.sudarshan.behavioural.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
       var browseHistory = new BrowseHistory();
       browseHistory.push("URL1");
       browseHistory.push("URL2");
       browseHistory.push("URL3");

       var iterator = browseHistory.createIterator();
       while (iterator.hasNext()){
           System.out.println(iterator.current());
           iterator.next();
       }
    }
}
