package _01_introduction_java.practice;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        System.out.println("a : " + a);

        double b = scanner.nextDouble();
        System.out.println("b :" + b);

        double c = scanner.nextDouble();
        System.out.println("c :" + c);

        if (a != 0) {
            double answer = (c - b) / a;
//            System.out.printf("Equation pass with x = %f!\n", answer);
            System.out.println("Equation pass with x =" +answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
