package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class TinhTongCacSoO1CotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng : ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột : ");
        int colum = scanner.nextInt();
        System.out.println("Nhập số cột muốn tính: ");
        int a = scanner.nextInt();

        double[][] array = new double[row][colum];
        double total = 0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < colum ; j++) {
                System.out.print("Array["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextDouble();
                if (j == a){
                    total += array[i][a];
                }
            }
        }
        System.out.println(total);
    }
}
