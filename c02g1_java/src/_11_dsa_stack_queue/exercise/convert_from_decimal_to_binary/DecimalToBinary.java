package _11_dsa_stack_queue.exercise.convert_from_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String toBinary = " ";
        System.out.println("Nhập số muốn chuyển đổi: ");
        int number=scanner.nextInt();
       while (number >0 ){
           stack.push(number%2);
           number = number/2;
       }
        System.out.println(stack);
        while (!stack.isEmpty()){
            toBinary += stack.pop();
        }
        System.out.println(toBinary);
    }

//    public void toBinary(int num){
//        Stack<Integer> stack = new Stack<>();
//        String string =" ";
//        while (num >0){
//            stack.push(num%2);
//            num = num/2;
//        }
//        while (!stack.isEmpty()){
//            string += stack.pop();
//        }
//        System.out.println(string);
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhập số muốn chuyển: ");
//        int num = scanner.nextInt();
//        new DecimalToBinary().toBinary(num);
//    }

}
