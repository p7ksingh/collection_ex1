package com.collection.collectionex.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistex1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Strawberry");
        fruits.add("Avacado");
        fruits.add("Mango");
        fruits.add("Banana");
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
