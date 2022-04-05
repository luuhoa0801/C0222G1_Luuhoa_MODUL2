package _04_class_and_objects_in_Java.exerise.class_quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number a: ");
        double a = scanner.nextDouble();
        System.out.print("input number b: ");
        double b = scanner.nextDouble();
        System.out.print("input number c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (a == 0){
            System.out.println("Phương trình có nghiệm: " + quadraticEquation.getRoot4());
        } else if (quadraticEquation.getDiscriminant() > 0 ){
            System.out.println("Nghiệm thứ nhất là: "+ quadraticEquation.getRoot1());
            System.out.print("Nghiệm thứ hai là: "+ quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0 ){
            System.out.print("Có nghiệm kép là: "+ quadraticEquation.getRoot3());
        }else {
            System.out.print("The equation has no roots");
        }

    }
}
