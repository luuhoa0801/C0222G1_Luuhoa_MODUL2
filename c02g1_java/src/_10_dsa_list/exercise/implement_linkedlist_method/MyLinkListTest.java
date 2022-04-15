package _10_dsa_list.exercise.implement_linkedlist_method;

public class MyLinkListTest {
    public static void main(String[] args) {

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Hòa");
        Student student2 = new Student(2,"long");
        Student student3 = new Student(3,"luu");
        Student student4 = new Student(4,"ly");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2,student4);
        System.out.println(myLinkedList.get(3).getName());
        myLinkedList.remove(2);
        myLinkedList.remove(student1);

        for (int i = 0; i <myLinkedList.size() ; i++) {
            System.out.println(myLinkedList.get(i).getName());
        }

        System.out.println(myLinkedList.contains(student1));

    }

}
