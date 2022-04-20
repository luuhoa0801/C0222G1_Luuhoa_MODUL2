package _15_exception_handling.exercise.use_class_illegaltriangleexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                flag = false;
                System.out.println("Nhập cạnh thứ nhất: ");
                double side1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ hai: ");
                double side2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ ba: ");
                double side3 = Double.parseDouble(scanner.nextLine());
                if (side1<=0 || side2<=0 || side3<=0)  {
                    throw new IllegalTriangleException("Nhập số dương: ");
                }
                if (side1+side2 < side3 || side1+side3<side2 || side2 + side3 <side1){
                    throw new IllegalTriangleException("Nhập lại độ dài");
                }
            }
            catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                flag = true;
            }catch (NumberFormatException e) {
                System.err.println("Nhập lại số: ");
                flag = true;
            }

        }
    }



}
