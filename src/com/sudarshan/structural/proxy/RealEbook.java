package com.sudarshan.structural.proxy;

public class RealEbook implements Ebook{
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    @Override
    public void show() {
        System.out.println("Showing the ebook:"+fileName);
    }

    private void load(){
        System.out.println("Loading the ebook:"+fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
