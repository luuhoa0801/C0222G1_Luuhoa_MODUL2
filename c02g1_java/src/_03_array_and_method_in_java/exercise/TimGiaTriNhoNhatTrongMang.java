package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length ; i++) {
            System.out.print(" array1[" + i+ "]= ");
            array1[i] = scanner.nextInt();
        }
        int min = minValue(array1);
        System.out.println("giá trị nhỏ nhất là " + array1[min]);
    }

    public static int minValue(int[] array) {
        int min = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] < array[min]){
                min = i ;
            }
        }
        return min;
    }
}
