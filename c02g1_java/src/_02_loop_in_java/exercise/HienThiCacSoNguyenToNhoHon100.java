package _02_loop_in_java.exercise;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
//        int number;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" input number : ");
//        number = scanner.nextInt();
        int number = 2;
        while (number < 100){
            boolean check = true;
            for (int i = 2; i <number ; i++) {
                if ( number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number + " is the prime number");
            }
            number++;
        }
    }
}
