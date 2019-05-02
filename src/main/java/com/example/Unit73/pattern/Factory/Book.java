package com.example.Unit73.pattern.Factory;

public class Book implements Item {
    @Override
    public void sell() {
        System.out.println("Selling book");
    }

    @Override
    public void buy() {
        System.out.println("Buying book");
    }

    @Override
    public void unpack() {
        System.out.println("Unpacking book");
    }

    @Override
    public void log() {
        System.out.println("write");
    }
}
