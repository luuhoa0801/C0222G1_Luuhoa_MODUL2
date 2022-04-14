package _11_dsa_stack_queue.exercise.count_string_using_map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ImplementTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        String [] stringArray = str.toLowerCase().split(" ");
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i <stringArray.length ; i++) {
            if (treeMap.containsKey(stringArray[i])){
                treeMap.put(stringArray[i],treeMap.get(stringArray[i]) +1);
            } else {
                treeMap.put(stringArray[i],1);
            }
        }
        System.out.println(treeMap);
        Set<String> setkey = treeMap.keySet();
        for (String item:setkey) {
            System.out.println(item + " xuất hiện "+ treeMap.get(item) +" lần");
        }
    }
}
