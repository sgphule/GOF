package com.sudarshan.creational.builder;

import java.util.ArrayList;

public class Presentation {
    private ArrayList<Slide> slides = new ArrayList<>();

    public void addSlides(Slide slide){
        slides.add(slide);
    }

    public void export(PresentationBuilder builder){
        slides.add(new Slide("Copyright"));
        for(Slide slide : slides){
            builder.addSlide(slide);
        }
    }
}
