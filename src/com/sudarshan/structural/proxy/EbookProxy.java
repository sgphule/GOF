package com.sudarshan.structural.proxy;

public class EbookProxy implements Ebook{
    private String fileName;
    private Ebook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook == null)
            ebook = new RealEbook(fileName);
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}