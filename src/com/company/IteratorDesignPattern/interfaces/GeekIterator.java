package com.company.IteratorDesignPattern.interfaces;

import com.company.IteratorDesignPattern.Product;

import java.util.ArrayList;

public class GeekIterator implements Iterator{

    private int position;
    private ArrayList<Product> inventory;

    public GeekIterator(ArrayList<Product> inventory){
        this.inventory = inventory;
    }

    @Override
    public Object next() {
        return inventory.get(position++);
    }

    @Override
    public boolean hasNext() {
        if(position >= inventory.size()){
            return false;
        }
        else return true;
    }
}
