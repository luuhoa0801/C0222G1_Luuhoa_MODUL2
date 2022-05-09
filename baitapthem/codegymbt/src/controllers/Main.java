package controllers;

import services.SubjectServicesImpl;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    displayMenu();
    }
    public static void displayMenu(){
        SubjectServicesImpl subject = new SubjectServicesImpl();
        while (true) {
            System.out.println("1: Danh sach các môn học ");
            System.out.println("2: Cập nhật thêm môn học ");
            System.out.println("3: Xóa 1 môn học ");
            System.out.println("4: Edit 1 môn học ");
            System.out.println("5: Thoát ");
            System.out.println("6: sắp xếp theo thời gian môn học ");
            switch (scanner.nextLine()) {
                case "1":
                    subject.displaySubject();
                    break;
                case "2":
                    subject.addNewSubject();
                    break;
                case "3":
                    subject.deleteSubject();
                    break;
                case "4":
                    subject.editSubject();
                    break;
                case "5":
                    System.exit(5);
                case "6":
                    subject.sortTime();
                    break;
                default:
                    System.out.println("Bạn đã nhập sai,vui lòng nhập lại");
            }
        }
    }
}
