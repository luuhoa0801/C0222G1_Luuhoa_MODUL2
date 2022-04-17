package _12_java_collection_framework.exercise.using_arraylist_liskedlist_javacollection.using_linkedlist;

import _12_java_collection_framework.exercise.using_arraylist_liskedlist_javacollection.using_arraylist.ProductManager;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("ArrayList: ");
            System.out.println("1:Xem danh sách ");
            System.out.println("2:thêm sản phẩm ");
            System.out.println("3:sửa sản phẩm theo id ");
            System.out.println("4:xóa sản phẩm theo id ");
            System.out.println("5:tìm kiếm sản phẩm theo tên");
            System.out.println("6:giá tăng dần ");
            System.out.println("7:thoát:");
            System.out.println("8: Chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.displayList();
                    break;
                case 2:
                    productManager.add();
                    break;
                case 3:
                    productManager.fixList();
                    break;
                case 4:
                    productManager.add();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 7:
                    System.exit(7);
                case 6:
                    productManager.sortPrice();
                    break;
            }

        }
    }
}
