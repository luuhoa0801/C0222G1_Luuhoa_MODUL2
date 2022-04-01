package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++){
            System.out.println(" array[ " + i + "] =: " );
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
