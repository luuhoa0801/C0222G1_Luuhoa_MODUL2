package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++){
            System.out.println("array [ " + i + "] = : ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int x;
        System.out.print("X = ");
        x = scanner.nextInt();

        for (int i = 0; i <array.length ; i++) {
            if (array[i] == x){
              for (int j= i+1; j <array.length;j++,i++){
                  array[i] = array[j];
              }
            }
        }
        array[array.length -1] = 0;

        System.out.println(Arrays.toString(array));

    }
}
