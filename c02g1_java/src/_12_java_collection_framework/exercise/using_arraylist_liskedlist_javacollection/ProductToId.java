package _12_java_collection_framework.exercise.using_arraylist_liskedlist_javacollection;

import java.util.*;

public class ProductToId implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
       if (o1.getPrice() > o2.getPrice()){
           return 1;
       }else if (o1.getPrice() < o2.getPrice()){
           return -1;
       }else {
           return 0;
       }
    }
}

