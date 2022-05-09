package controllers;

import models.Work;
import services.WorkServiceImpl;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayMenuWork();
    }
    public static void displayMenuWork(){
        WorkServiceImpl work = new WorkServiceImpl();
        while (true) {
            System.out.println("1: Display menu all work ");
            System.out.println("2: Add new work ");
            System.out.println("3: Update work ");
            System.out.println("4: Exit ");
            switch (scanner.nextLine()) {
                case "1":
                    display();
                    break;
                case "2":
                    work.addWork();
                    break;
                case "3":
                    work.update();
                    break;
                case "4":
                    System.exit(4);
                default:
                    System.out.println("Bạn đã nhập sai,vui lòng nhập lại");
            }
        }
    }
    public static  void display(){
        WorkServiceImpl workService = new WorkServiceImpl();
        while (true){
            System.out.println("1: display by priority ");
            System.out.println("2: display by order ");
            System.out.println("3: exit ");
            switch (scanner.nextLine()){
                case "1":
                   workService.displayByPriority();
                    break;
                case "2":
                    workService.displayByOrder();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Mời bạn nhập lại");

            }
        }
    }
}
