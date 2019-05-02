package com.example.Unit73.pattern.Factory;

public class ComputerStore extends Store {
    @Override
    public Item createItem() {
        return new Computer();
    }
}
