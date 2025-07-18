package com.sudarshan.behavioural.visitor;

public class AnchorNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
