package _11_dsa_stack_queue.exercise.reverse_element_in_interger_array_stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập độ dài mảng: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.print("[ "+i +"]: ");
            array[i]=scanner.nextInt();
            stack.push(array[i]);
        }
        System.out.println("stack: "+stack  );
        for (int i = 0; i <size ; i++) {
            array[i] = stack.pop();
        }
        System.out.print("array: "+ Arrays.toString(array));
    }
}
