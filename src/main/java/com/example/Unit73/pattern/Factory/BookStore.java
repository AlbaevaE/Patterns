package com.example.Unit73.pattern.Factory;

public class BookStore extends Store {
    @Override
    public Item createItem() {
        return new Book();
    }


}
