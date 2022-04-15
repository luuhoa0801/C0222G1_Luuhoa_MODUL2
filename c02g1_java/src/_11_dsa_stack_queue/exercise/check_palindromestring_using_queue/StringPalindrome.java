package _11_dsa_stack_queue.exercise.check_palindromestring_using_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StringPalindrome {
    public static void main(String[] args) {
        String string = "Able was i ere i saw Elba";
        String[] stringArray;
        stringArray = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String string1 = "";
        String string2 = "";
        for (int i = 0; i <stringArray.length; i++) {
            stack.push(stringArray[i].toLowerCase());
            queue.add(stringArray[i].toLowerCase());
        }
        for (int i = 0; i <stringArray.length ; i++) {
            string1 += stack.pop();
            string2 += queue.poll();
        }

        if (string1.equals(string2)){
            System.out.println("Là chuỗi Palindrome ");
        }else {
            System.out.println("Không phải là chuỗi Palindrome");
        }
    }
}
