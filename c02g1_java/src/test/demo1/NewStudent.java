package test.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class NewStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student [] array = new Student [3];
        for (int i = 0; i < array.length ; i++) {
            System.out.print("Nhập tên : ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.print("nhập điểm: ");
            int point = Integer.parseInt(scanner.nextLine());
            array[i] = new Student(name,age,address,point);
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Nhập phần từ muốn xóa: ");
        int delete = scanner.nextInt();
        array[delete -1] = null;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == null){
               continue;
            }
            System.out.print(array[i]);
        }

    }
}
