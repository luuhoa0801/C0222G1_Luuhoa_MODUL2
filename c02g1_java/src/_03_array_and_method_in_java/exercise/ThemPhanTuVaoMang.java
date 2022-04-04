package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[10];
        for (int i = 0; i < 6; i++){
            System.out.print(" array[ " + i + "] =: " );
            array1[i] = scanner.nextInt();
        }
        System.out.println("number insert : ");
        int number = scanner.nextInt();

        int indexnumber;
       do {
           System.out.println("input vị trí insert : ");
           indexnumber = scanner.nextInt();
       }while (indexnumber <= -1 | indexnumber >= array1.length -1);

        System.out.print( Arrays.toString (insert(array1,number,indexnumber)) );
//
//        for (int i = array.length -1 ; i >=indexinsert ; i--) {
//            array[i] = array[i - 1];
//        } array[indexinsert] = numberinsert;
//        System.out.println(Arrays.toString(array));


    }

    public static int[] insert( int[] array, int numberinsert, int indexinsert){
        for (int i = array.length -1 ; i >= indexinsert  ; i--) {
            array[i] = array[i -1];
        }
        array[indexinsert] = numberinsert;
        return array;
    }
}
