package _13_search_algorithm.exercise.stringup_maximumlength;

import java.util.LinkedList;
import java.util.Scanner;

public class StringMaxLength {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input string: ");
      String string = scanner.nextLine();

      LinkedList<Character> list = new LinkedList<>();
      list.add(string.charAt(0));
      for (int i = 1; i <string.length() ; i++) {
         if (string.charAt(i) > list.getLast()){
            list.add(string.charAt(i));
         }
      }
      for (Character item:list) {
         System.out.print(item);
      }
   }
}                                                         
