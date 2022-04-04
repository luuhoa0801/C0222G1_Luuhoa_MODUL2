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
        int number = scanner.nextInt();
        double[][] array = new double[row][colum];
        System.out.print(totalNumber(row,colum,number));

//        double total = 0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < colum; j++) {
//                System.out.print("Array[" + i + "][" + j + "]: ");
//                array[i][j] = scanner.nextDouble();
//                if (j == number) {
//                    total += array[i][number];
//                }
//            }
//        }
//        System.out.println(total);
    }

    public static double totalNumber(int a, int b, int c ) {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[a][b];
        double total = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextDouble();
                if ( j == c ){
                    total += array[i][c];
                }
            }
        }
        return total;
    }

}



