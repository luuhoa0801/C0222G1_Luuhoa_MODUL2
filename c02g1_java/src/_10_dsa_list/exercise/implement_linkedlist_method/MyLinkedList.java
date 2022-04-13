package _10_dsa_list.exercise.implement_linkedlist_method;

import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public void add(int index, E element){
        // khái báo biến temp trỏ đến head
        Node temp = head;
        Node holder;
        //con trỏ chạy tới index-1 và vị trí tiếp k pải là null
        for (int i = 0; i <index - 1 && temp.next != null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public void addLast(E e){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }
    public void addFirst(E e){
        Node temp =head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }
    public int size(){
        return numNodes;
    }
    public boolean contains(E o){
        Node temp = head;
        for (int i = 0; i <numNodes ; i++) {
            if (temp.data == o){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E o){
        Node temp = head;
        for (int i = 0; i <numNodes ; i++) {
            if (temp.data ==o){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E get(int index){
        Node temp = head;
        for (int i = 0; i <index ; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public E getFist(){
        Node temp = head;
        return (E) temp.getData();
    }
    public E getLast(){
        Node temp = head;
        while (temp != null){
            if (temp.next == null){
                return (E) temp.getData();
            }
            temp = temp.next;
        }
        return null;
    }

    public E remove(int index)  {
        if (index < 0 || index > numNodes){
           throw new IndexOutOfBoundsException("Error index:" + index);
        }
        Node temp =head;
        Object data;
        if (index == 0){
            data = temp.data;
            head = head.next;
            numNodes--;
        }else {
            for (int i = 0; i <index -1 && temp.next != null ; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E e) {
        if (head.data.equals(e)) {
            remove(0);
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(e)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return true;
    }
    public MyLinkedList<E> clone() {
        if (numNodes == 0){
            throw new NullPointerException("LinkedList này null");
        }
        MyLinkedList<E> returnLinklist = new MyLinkedList<>();
        Node temp = head;
        returnLinklist.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null){
            returnLinklist.addLast((E) temp.data);
        }
        return returnLinklist;
    }
    
}
