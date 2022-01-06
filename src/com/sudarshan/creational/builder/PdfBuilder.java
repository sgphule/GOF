package com.sudarshan.creational.builder;

public class PdfBuilder implements PresentationBuilder{
    private PdfDocument document = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addSlide(slide.getText());
    }
}