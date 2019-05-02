package com.example.Unit73.pattern.Factory2;

import com.example.Unit73.pattern.Factory.Book;
import com.example.Unit73.pattern.Factory.Computer;
import com.example.Unit73.pattern.Factory.Item;

public class ItemFactory {
    public Item getItem(String name){
        if(name.equals("Book")){
            return new Book();
        }
        else if (name.equals("Computer")){

        }
        return new Computer();
    }

    public static void main(String[] args) {

    }
}
