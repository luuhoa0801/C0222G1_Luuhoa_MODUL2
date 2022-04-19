package _14_sort_algorithm.exercise.install_insertion_sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
        InsertionSort.insertionSort(list);
    }
}
