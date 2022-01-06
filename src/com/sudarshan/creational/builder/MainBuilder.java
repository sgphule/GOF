package com.sudarshan.creational.builder;

public class MainBuilder {
    public static void main(String[] args){
        var presentation = new Presentation();
        presentation.addSlides(new Slide("Slide 1"));
        presentation.addSlides(new Slide("Slide 2"));
        var movie = new MovieBuilder(); //var document = new PdfBuilder();
        presentation.export(movie);
    }
}