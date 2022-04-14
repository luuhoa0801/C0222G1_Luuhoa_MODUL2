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
//        String result = "";
        boolean flag = true;
        String left = "";
        for (int i = 0; i <array.length ; i++) {
            if (array[i].equals("(")){
                bStack.push(array[i]);
            }
            if (array[i].equals(")")){
                if (bStack.isEmpty()){
//                    result= "false";
                    flag = false;
                }else if (array[i].equals(")") && bStack.pop().equals("(")){
//                    result="true";
                    flag = true;
                } else {
                    flag = false;
                }
//                left = bStack.pop();
//                if (left.equals(array[i])){
//                    result="false";
//                }
            }
        }
        if (bStack.isEmpty()){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
    }
}
