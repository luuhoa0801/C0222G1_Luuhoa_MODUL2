package _01_introduction_java.exercise;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double a = scanner.nextDouble();
         double b = (a % 100) % 10 ;

        System.out.println(b);
    }
}
