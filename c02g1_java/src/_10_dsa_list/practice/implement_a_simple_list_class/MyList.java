package _10_dsa_list.practice.implement_a_simple_list_class;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //tăng gấp đôi kích thước của mảng chứa các phần tử
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }
    //thêm phần từ vào cuối của danh sách
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public E get(int i){
        if ( i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}
