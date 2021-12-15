package com.sudarshan.behavioural.visitor;

public interface Operation {
    void apply(HeadingNode header);
    void apply(AnchorNode anchor);
}
