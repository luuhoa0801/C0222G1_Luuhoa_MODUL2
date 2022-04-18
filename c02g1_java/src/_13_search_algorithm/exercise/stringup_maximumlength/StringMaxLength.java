package _13_search_algorithm.exercise.stringup_maximumlength;

import java.util.LinkedList;
import java.util.Scanner;

public class StringMaxLength {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);          //1
      System.out.println("Input string: ");              //1
      String string = scanner.nextLine();                //1

      LinkedList<Character> list = new LinkedList<>();    //1
      list.add(string.charAt(0));                         //1
      for (int i = 1; i <string.length() ; i++) {         //n*(1*1) = n
         if (string.charAt(i) > list.getLast()){
            list.add(string.charAt(i));
         }
      }
      for (Character item:list) {                         //n *1 = 1
         System.out.print(item);
      }
   }
}                                                         // n
