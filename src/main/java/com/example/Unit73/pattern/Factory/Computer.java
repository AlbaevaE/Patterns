package com.example.Unit73.pattern.Factory;

public class Computer implements Item {
    @Override
    public void sell() {
        System.out.println("selling computer");
    }

    @Override
    public void buy() {
        System.out.println("buying computer");
    }

    @Override
    public void unpack() {
        System.out.println("unpacking computer");
    }

    @Override
    public void log() {
        System.out.println("logging computer");
    }
}
