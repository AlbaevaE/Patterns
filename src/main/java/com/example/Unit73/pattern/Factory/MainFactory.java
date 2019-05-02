package com.example.Unit73.pattern.Factory;

import com.example.Unit73.pattern.Factory2.ItemFactory;

public class MainFactory {
    private static Store store;
    public static void configurate(String name){
        if(name.equals("Book")){
            store = new BookStore();
        }
        else if(name.equals("Computer")){
            store = new ComputerStore();
        }
    }
    public static void main(String[] args) {
//       configurate("Computer");
//       store.addItem();
//       configurate("Book");
//       store.addItem();

        ItemFactory factory = new ItemFactory();
        Computer com = (Computer)factory.getItem("Computer");
        Book b = (Book)factory.getItem("Book");
    }
}
