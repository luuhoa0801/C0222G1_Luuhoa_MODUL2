package _15_exception_handling.exercise.use_class_illegaltriangleexception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ nhất: ");
        int side1 = scanner.nextInt();
        System.out.println("Nhập cạnh thứ hai: ");
        int side2 = scanner.nextInt();
        System.out.println("Nhập cạnh thứ ba: ");
        int side3 = scanner.nextInt();
        IllegalTriangleException ill = new IllegalTriangleException();
        ill.illegalTriangleException(side1,side2,side3);
    }
    public void illegalTriangleException(int a,int b,int c) {
        try{
            if (a < 0 || b < 0 || c < 0  ){
                throw  new Triangle(" Nhập số dương: ");
            }
            if ( a + b < c || a+c < b || b+c < a){
                throw new Triangle(" Nhập đúng");
            }
        }catch (Exception e){
            System.err.println("xảy ra trường hợp ngoại lệ" + e.getMessage());
        }
    }
}
