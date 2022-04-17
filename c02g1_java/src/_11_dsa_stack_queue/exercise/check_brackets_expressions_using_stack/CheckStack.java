package _11_dsa_stack_queue.exercise.check_brackets_expressions_using_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> bStack = new Stack<>();
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        String[] array = str.split("");
        boolean flag = true;
        String result = "";
        String left = "";
        for (int i = 0; i <array.length ; i++) {
            if (array[i].equals("(")){
                bStack.push(array[i]);
            }
            if (array[i].equals(")")){
                if (bStack.isEmpty()){
                    result = "false";

                }else if (array[i].equals(")") && bStack.pop().equals("(")){
                    result = "false";
                } else {
                    result = "true";
                }
            }
        }
        if (!bStack.isEmpty()){
            System.out.println("false");
        }else {
            System.out.println("true");
        }

    }
}
