package _12_java_collection_framework.exercise.using_arraylist_liskedlist_javacollection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainArrayList {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        arrayList.add(new Product(1,"coca",3000));
        arrayList.add(new Product(2,"pepsi",2000));
        arrayList.add(new Product(3,"7up",8000));
        arrayList.add(new Product(4,"string",4000));

        while (true){
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
            switch (choice){
                case 3:
                  fixList();
                  break;
                case 2:
                    add();
                    break;
                case 1:
                    displayList();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 7:
                    System.exit(7);
                case 6:
                    sortPrice();
                    break;
            }

        }
    }
    public static void displayList(){
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i) != null){
                System.out.println(arrayList.get(i));

            }
        }
    }
    public static void fixList(){
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(i);
                arrayList.add(new Product(id, name, price));
            }
        }
        Collections.sort(arrayList);
        displayList();
    }
    public static void add(){
        System.out.println("Input id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input price");
        int price = Integer.parseInt(scanner.nextLine());
        arrayList.add(new Product(id,name,price));
        Collections.sort(arrayList);
        displayList();
    }
    public static void remove(){
        System.out.println("Input id remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).getId() == id){
                arrayList.remove(i);
            }
        }
        Collections.sort(arrayList);
        displayList();
    }
    public static void search(){
        System.out.print("Input name search: ");
        String search = scanner.nextLine();
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).getName().equals(search)){
                System.out.println(arrayList.get(i));
            }
        }
        Collections.sort(arrayList);
        displayList();
    }
    public static void sortPrice(){
        ProductToId productToId = new ProductToId();
        Collections.sort(arrayList,productToId);
        displayList();
    }

}
