package com.sudarshan.behavioural.visitor;

public class MainVisit {
    public static void main(String[] args){
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
       // document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}