package _02_loop_in_java.exercise;

import java.util.Scanner;

public class Hien20SoNguyenToDauTien {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("số lần muốn in ra : ");
        number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number){
            boolean check = true;
            for (int i = 2; i < n; i++){
                if ( n % i ==0 ){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(n);
                count++;
            }
            n++;
        }

    }
}
