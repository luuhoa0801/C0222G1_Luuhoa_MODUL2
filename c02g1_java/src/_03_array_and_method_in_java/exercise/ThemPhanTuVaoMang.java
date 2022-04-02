package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 6; i++){
            System.out.print(" array[ " + i + "] =: " );
            array[i] = scanner.nextInt();
        }
        System.out.println("number insert : ");

        int numberinsert = scanner.nextInt();
        int indexinsert;
       do {
           System.out.println("input vị trí insert : ");
           indexinsert = scanner.nextInt();

       }while (indexinsert <= -1 | indexinsert >= array.length -1);

        for (int i = array.length -1 ; i >=indexinsert ; i--) {
            array[i] = array[i - 1];
        } array[indexinsert] = numberinsert;
        System.out.println(Arrays.toString(array));
    }
}
