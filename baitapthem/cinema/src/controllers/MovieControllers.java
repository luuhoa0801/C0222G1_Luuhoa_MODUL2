package controllers;

import service.ShowTimeImpl;

import java.util.Scanner;

public class MovieControllers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu() {

        ShowTimeImpl movie = new ShowTimeImpl();

        while (true) {
            System.out.println("1: Danh sach suất chiếu. ");
            System.out.println("2: Thêm 1 suất chiếu ");
            System.out.println("3: Xóa 1 suất chiếu ");
            System.out.println("5: edit 1 suất chiếu ");
            System.out.println("4: Thoát ");

            switch (scanner.nextLine()) {
                case "4":
                    return;
                case "2":
                    movie.addNewShowTime();
                    break;
                case "1":
                    movie.displayShowtime();
                    break;
                case "3":
                    movie.removeShowtime();
                    break;
                case "5":
                    movie.editShowtime();
                    break;

            }

        }
    }

}
