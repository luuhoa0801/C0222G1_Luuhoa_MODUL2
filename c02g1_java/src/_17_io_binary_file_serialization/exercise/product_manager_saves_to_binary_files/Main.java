package _17_io_binary_file_serialization.exercise.product_manager_saves_to_binary_files;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static ReadAndWrite readAndWrite = new ReadAndWrite();
    static final String FILE_NAME="src\\_17_io_binary_file_serialization\\exercise\\product_manager_saves_to_binary_files\\test.csv";

    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){
        boolean check = true;
        while (check){
            System.out.println(" 1: Hiển thị sản phẩm");
            System.out.println(" 2: Thêm sản phẩm ");
            System.out.println(" 3: Tìm kiếm sản phẩm theo tên");
            System.out.println(" 4: Thoát menu ");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    disPlay();
                    break;
                case 2:
                    addNewProduct();
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
    public static void disPlay(){
        try {
            productList = (List<Product>) readAndWrite.readFile(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Product product: productList) {
            System.out.println(product);
        }
        displayMenu();
    }
    public static void addNewProduct(){

        try {
            productList = (List<Product>) readAndWrite.readFile(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        readAndWrite.writeFile("src\\_17_io_binary_file_serialization" +
                "\\exercise\\product_manager_saves_to_binary_files\\test.csv",productList);
        }
    }
    public static void searchById(){

        try {
            productList = (List<Product>) readAndWrite.readFile(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean check = true;
        System.out.println("Nhập tên muốn tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i <productList.size() ; i++) {
            if (productList.get(i).getName().contains(name)){
                check = false;
                System.out.println(productList.get(i));
                break;
            }
        }
        if (check){
            System.out.println("Không có sản phẩm này...");
        }
    }
}
