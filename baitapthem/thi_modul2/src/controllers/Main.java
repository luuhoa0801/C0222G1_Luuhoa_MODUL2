package controllers;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){

        while (true) {
            System.out.println("1:  ");
            System.out.println("2:  ");
            System.out.println("3:  ");
            System.out.println("4:  ");
            System.out.println("5: Thoát ");
            switch (scanner.nextLine()) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":
                    System.exit(5);
                default:
                    System.out.println("Bạn đã nhập sai,vui lòng nhập lại");
            }
        }
    }
}
