package com.sudarshan.behavioural.strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Black and White filter");
    }
}
