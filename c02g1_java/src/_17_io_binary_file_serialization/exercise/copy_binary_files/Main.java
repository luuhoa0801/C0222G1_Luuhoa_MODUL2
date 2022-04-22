package _17_io_binary_file_serialization.exercise.copy_binary_files;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static ReadAndWrite readAndWrite = new ReadAndWrite();

    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){
        boolean check = true;
        while (check){
            System.out.println(" 1: Hiển thị sản phẩm");
            System.out.println(" 2: Thêm sản phẩm ");
            System.out.println(" 3: Tìm kiếm sản phẩm theo ID");
            System.out.println(" 4: Thoát menu ");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    disPlay();
                    break;
                case 2:
                    addNewProduct();
                    copy();
                    break;
                case 3:
                    searchById();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
    public static void disPlay() {
        try {
            productList = (List<Product>) readAndWrite.readFile("src\\_17_io_binary_file_serialization\\exercise\\copy_binary_files\\source.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Product product:productList) {
            System.out.println(product);
        }
    }
    public static void addNewProduct(){
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i <productList.size() ; i++) {
            if (id == productList.get(i).getIdProduct()){
                flag = false;
                break;
            }
        }
        if (!flag){
            System.out.println("Đã có sản phẩm này với ID bạn vừa nhập !!! ");
        }else {

            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập hãng sản xuất: ");
            String theFirm = scanner.nextLine();
            System.out.println("Nhập giá: ");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Các mô tả khác: ");
            String other = scanner.nextLine();
            Product product =new Product(id,name,theFirm,price,other);
            productList.add(product);
            System.out.println("Thêm mới sản phẩm thành công");
            readAndWrite.writeFile("src\\_17_io_binary_file_serialization\\exercise\\copy_binary_files\\source.txt",productList);

        }

    }
    public static void searchById(){
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <productList.size() ; i++) {
            if (id==productList.get(i).getIdProduct()){
                System.out.println(productList.get(i));
            }else {
                System.out.println("không có sản phẩm này");
            }
        }
    }
    public static void copy()  {
        List<Product> proList = new ArrayList<>();
        try {
            proList = (List<Product>) readAndWrite.readFile("src\\_17_io_binary_file_serialization\\exercise\\copy_binary_files\\source.txt");
            readAndWrite.writeFile("F:\\codegym\\C0222G1_Luuhoa_MODUL2\\c02g1_java\\src\\_17_io_binary_file_serialization\\exercise\\copy_binary_files\\target.txt",proList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
