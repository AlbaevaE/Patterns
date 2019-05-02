package com.example.Unit73.pattern.Factory;


public abstract class Store {
    public void addItem(){
        Item item = createItem();
        item.buy();
        item.sell();
        item.unpack();
        item.log();
    }
    public abstract Item createItem();
}
