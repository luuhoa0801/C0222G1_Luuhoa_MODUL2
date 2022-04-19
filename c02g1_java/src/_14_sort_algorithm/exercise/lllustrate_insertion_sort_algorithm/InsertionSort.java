package _14_sort_algorithm.exercise.lllustrate_insertion_sort_algorithm;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int [] list){
        int key;
        int j;
        for (int i = 0; i <list.length ; i++) {
            key = list[i];
            j = i;
            while (j > 0 && key < list[j-1]){
                int temp = list[j];
                list[j] = list[j-1];
                list[j-1] = temp;
                j--;
                System.out.println(Arrays.toString(list));
            }
            list[j] = key;
        }
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng list: ");
        int size = Integer.parseInt(scanner.nextLine());
        int [] list = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("list[" + i+"]=: " );
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(list));
        System.out.println("result: ");
        insertionSort(list);
    }
}
