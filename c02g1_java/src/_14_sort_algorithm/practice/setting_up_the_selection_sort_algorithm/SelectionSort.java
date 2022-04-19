package _14_sort_algorithm.practice.setting_up_the_selection_sort_algorithm;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list){
        for (int i = 0; i <list.length ; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = 0; j <list.length ; j++) {
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
