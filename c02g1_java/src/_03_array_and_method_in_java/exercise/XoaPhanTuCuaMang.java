package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[6];
        for (int i = 0; i < array1.length; i++){
            System.out.print("array [ " + i + "] = : ");
            array1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        int inputnumber;
        System.out.print("inputnumber = ");
        inputnumber = scanner.nextInt();
        System.out.print(Arrays.toString(delete(array1,inputnumber)));

    }

    public static int[] delete( int[] array, int number){
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == number){
                for (int j = i + 1; j < array.length ; j++, i++) {
                    array[i] = array[j];
                }
            }
        }
        array[array.length -1] = 0;
        return array;
    }
}
