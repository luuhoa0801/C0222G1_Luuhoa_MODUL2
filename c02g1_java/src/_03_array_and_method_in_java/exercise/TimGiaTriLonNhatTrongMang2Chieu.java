package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng : ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột : ");
        int colum = scanner.nextInt();

        int[][] array = new int[row][colum];

        int max = array[0][0] ;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < colum ; j++) {
                System.out.print("array["+i+"]["+j+"] :"  );
                array[i][j] = scanner.nextInt();
                if ( array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println( max);
    }
}
