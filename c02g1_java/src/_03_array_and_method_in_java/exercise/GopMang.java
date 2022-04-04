package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new  int[5];
        for (int i = 0; i <5 ; i++) {
            System.out.print("input array1 [" + i +"]= " );
            array1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i <5 ; i++) {
            System.out.print("input array2 [" + i +"]= ");
            array2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array2));

        System.out.print(Arrays.toString(newArray(array1,array2)));

//         int[] array3 = new int[10];


//        for (int i = 0; i < 5 ; i++) {
//            array3[i] = array1[i];
//        }
//        for (int i = 0; i <5 ; i++) {
//            array3[array2.length + i ] = array2[i];
//        }
//        System.out.println(Arrays.toString(array3));

    }

    public static int[] newArray(int[] arrayA , int[] arrayB ){
        int [] arrayC = new int [arrayA.length + arrayB.length];
        for (int i = 0; i < 5 ; i++) {
            arrayC[i] = arrayA[i];
        }
        for (int i = 0; i <5 ; i++) {
            arrayC [ arrayB.length + i ] = arrayB [i];
        }
        return arrayC;
    }
}
