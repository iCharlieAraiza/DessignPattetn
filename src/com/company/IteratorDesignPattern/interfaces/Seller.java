package com.company.IteratorDesignPattern.interfaces;

import com.company.IteratorDesignPattern.GeekStoreCatalog;
import com.company.IteratorDesignPattern.Product;

public class Seller {
    GeekStoreCatalog catalog;

    public Seller(GeekStoreCatalog catalog){
        this.catalog = catalog;
    }

    public void printCatalog(){
        GeekIterator iterator = (GeekIterator) catalog.createIterator();
        printCatalog(iterator);
    }

    private void printCatalog(Iterator iterator){
        while(iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println("ID: " + product.getId());
            System.out.println("Nombre: " + product.getName()+"\n");
        }
    }
}
