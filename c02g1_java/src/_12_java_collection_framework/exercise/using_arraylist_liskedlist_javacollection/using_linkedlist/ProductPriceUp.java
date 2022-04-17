package _12_java_collection_framework.exercise.using_arraylist_liskedlist_javacollection.using_linkedlist;

import java.util.Comparator;

public class ProductPriceUp implements Comparator<Product> {
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
