package _14_sort_algorithm.exercise.install_insertion_sort_algorithm;

import java.util.Arrays;

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
            }
            list[j] = key;
        }
        System.out.println(Arrays.toString(list));
    }
}
