package test.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class NewPerson {
    static Scanner scanner = new Scanner(System.in);
    static Person[] array = new Person[10];

    public static void addStudent() {
        System.out.println(" Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập 1:NAM    2:Nữ ");
        boolean gender = false;
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            gender = true;
        }
        System.out.println("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());
        Person student = new Student(name, age, gender, point);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = student;
                break;
            }
        }
        displayList();
    }

    public static void displayList() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }
    }

    public static void addTeacher() {
        System.out.println(" Nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập 1:NAM    2:Nữ ");
        boolean gender = false;
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            gender = true;
        }
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Person teacher = new Teacher(name, age, gender, salary);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = teacher;
                break;
            }
        }
        displayList();
    }

    public static void deleteTeacher() {
        System.out.println("Nhập tên cần xóa");
        String name = scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].getName().equals(name) && array[i] instanceof Teacher) {
                    for (int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                }
            } else {
                break;
            }
        }
        displayList();
    }

    public static void deleteStudent() {
        System.out.println("Nhập tên học viên cần xóa: ");
        String name = scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].getName().equals(name) && array[i] instanceof Student) {
                    for (int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                }
            } else {
                break;
            }
        }
        displayList();
    }
    public static void listStudent(){
        for (Person item: array) {
            if (item instanceof  Student){
                Student student = (Student) item;
                System.out.println(student.toString());
            }
        }
    }
    public static void listTeacher(){
        for (Person item: array) {
            if (item instanceof Teacher ){
                Teacher teacher = (Teacher) item;
                System.out.println(teacher.toString());
            }
        }
    }


    public static void main(String[] args) {
        array[0] = new Student("Hoa", 16, true, 6);
        array[1] = new Student("Luu", 17, false, 7);
        array[2] = new Teacher("Tien", 25, true, 15000000);
        array[3] = new Teacher("Chien", 25, true, 15000000);

        while (true) {
            System.out.println("Menu");
            System.out.println(" 1: Xem danh sách ");
            System.out.println(" 2: Thêm học viên mới ");
            System.out.println(" 3: Thêm giáo viên ");
            System.out.println(" 4: Xóa học viên ");
            System.out.println(" 5: Xóa giáo viên ");
            System.out.println(" 6: Hiển thị danh sách học viên ");
            System.out.println(" 7: Hiển thị danh sách giáo viên ");
            System.out.println(" 8: Exit ");
            System.out.println(" Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 2:
                    addStudent();
                    break;
                case 1:
                    displayList();
                    break;
                case 3:
                    addTeacher();
                    break;
                case 5:
                    deleteTeacher();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 6:
                    listStudent();
                    break;
                case 7:
                    listTeacher();
                    break;
                case 8:
                    System.exit(8);
            }
        }
    }

}
