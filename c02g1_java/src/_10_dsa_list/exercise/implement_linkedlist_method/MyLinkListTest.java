package _10_dsa_list.exercise.implement_linkedlist_method;

public class MyLinkListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Hòa");
        Student student2 = new Student(2,"long");
        Student student3 = new Student(3,"luu");
        Student student4 = new Student(4,"ly");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(3,student4);
        myLinkedList.remove(2);
        myLinkedList.remove(student1);

        for (int i = 0; i <myLinkedList.size() ; i++) {
            System.out.println(myLinkedList.get(i).getName());
        }

        System.out.println(myLinkedList.contains(student1));

    }

}
