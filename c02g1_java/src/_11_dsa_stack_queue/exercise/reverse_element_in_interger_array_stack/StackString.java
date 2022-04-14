package _11_dsa_stack_queue.exercise.reverse_element_in_interger_array_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1= " ";
        Stack<String> wStack = new Stack<>();
        String [] array1 = str.split(" ");
        for (int i = 0; i <array1.length ; i++) {
            wStack.push(array1[i]);
        }
        System.out.println(wStack);
//        for (int i = 0; i <array1.length ; i++) {
//            array1[i] = wStack.pop();
//        }
        while (!wStack.isEmpty()){
            str1 += wStack.pop() + " ";
        }
        System.out.println(str1);
    }
}
