package _10_dsa_list.exercise.implement_arraylist_method_by_library;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];


    public MyList(){
    elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapacity(int minCapacity){
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(int index, E element){
        for (int i = size -1; i >= index ; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }
    public boolean add(E e){
        if (size == elements.length){
            ensureCapacity(5);
        }
        elements[size++] = e;
        return true;
    }
    public E get(int i){
        if (i >= size || i <0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );

        }
        return (E) elements[i];
    }

    public E remove(int index) {
        Object resultremove = elements[index];
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + "out of bounds");
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
            return (E) resultremove;
        }
    }
    public int size() {
        return size;
    }
    public int indexOf(E o){
        for (int i = 0; i <size ; i++) {
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(E o){
        for (int i = 0; i <size ; i++) {
            if (elements[i]==o){
                System.out.print(elements[i] + " : ");
                return true;
            }
        }
        return false;
    }

    @Override
    public E clone() {
        Object[] cMyList = new Object[DEFAULT_CAPACITY];
        if (size == elements.length) {
            ensureCapacity(5);
        }
        for (int i = 0; i < size; i++) {
            cMyList[i] = elements[i];
        }
        return (E) Arrays.toString(cMyList);
    }
    public void clear(){
        elements = new Object[0];
        size=0;
    }


//    @Override
//    public String toString() {
//        return "MyList{" +
//                "size=" + size +
//                ", elements=" + Arrays.toString(elements) +
//                '}';
//    }

            @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }

}
