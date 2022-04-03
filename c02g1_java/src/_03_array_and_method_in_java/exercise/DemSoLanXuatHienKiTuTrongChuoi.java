package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class DemSoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi tại đây: ");
        String a = scanner.next();
//        String a = "luu hoa";
        System.out.print("Nhập kí tự muốn kiểm tra: ");
        char b = scanner.next().charAt(0);
         int count = 0 ;

        for (int i = 0; i <a.length() ; i++) {
            if ( a.charAt(i) == b ){
                count++;
            }
        }
        System.out.print("số lần xuất hiện là "+count );
    }
}
