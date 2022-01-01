package com.sudarshan.structural.proxy;

public class MainProxy {
    public static void main(String[] args){
        var library = new Library();
        String[] fileNames = {"a","b","c"};
        for(var fileName : fileNames){
            library.add(new EbookProxy(fileName));
        }

        library.openEbook("a");

        for(var fileName : fileNames){
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("c");
    }
}
