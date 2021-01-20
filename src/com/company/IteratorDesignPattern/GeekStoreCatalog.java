package com.company.IteratorDesignPattern;

import com.company.IteratorDesignPattern.interfaces.GeekIterator;
import com.company.IteratorDesignPattern.interfaces.Iterator;

import java.util.ArrayList;

public class GeekStoreCatalog {
    private ArrayList<Product> products = new ArrayList<>();

    public GeekStoreCatalog(){}

    public void addProduct(Product product){
        products.add(product);
    }

    public Iterator createIterator(){
        return new GeekIterator(products);
    }

}
