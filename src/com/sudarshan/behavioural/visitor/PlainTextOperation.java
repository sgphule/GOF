package com.sudarshan.behavioural.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode head) {
        System.out.println("Text-heading ");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Text-anchor");
    }
}
