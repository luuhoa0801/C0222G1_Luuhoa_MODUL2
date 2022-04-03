package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class Mang2ChieuTinhTongCacSoODuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int colum = scanner.nextInt();
        double[][] array = new double[row][colum];
        double total = 0;
        double sum =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("Array[" + i + "][" + j + "]= ");
                array[i][j] = scanner.nextDouble();
                if (i == j ){
                    total += array[i][j];
                }
                if ((i + j) ==(array.length -1)){
                    sum += array[i][j];
                }
            }
        }
        System.out.println(total);
        System.out.print(sum);
    }
}
