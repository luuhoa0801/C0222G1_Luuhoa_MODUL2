package _02_loop_in_java.exercise;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int click = -1;
        Scanner input = new Scanner(System.in);
        while (click != 0){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different" +
                    " angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            click = input.nextInt();

            switch (click){
                case 1 :
                    for (int i = 0;i < 3;i ++){
                        for (int j = 0 ; j < 7; j ++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2 :
                    for (int i = 1; i <= 5;i++){
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("\n");

                    for ( int i = 1;i <= 7; i++){
                        for ( int j = 7; i <= j ; j--){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("\n");

                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <= 5 ; j++) {
                            if ( i > j ){
                                System.out.print("  ");
                            }else {
                                System.out.print("* ");
                            }
                        }
                        System.out.print("\n");
                    }
                    System.out.println("\n");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <= 5 ; j++) {
                            if (i <= 5 -j ){
                                System.out.print("  ");
                            }else {
                                System.out.print("* ");
                            }
                        }
                        System.out.print("\n");
                    }

                    break;

                case 3 :
                    for (int i =0;i <=4;i++) {
                        for (int j = 1; j <=9; j++) {
                            if ((j>=(5-i))&&(j<=(5+i))){
                                System.out.print("*");;
                            }
                        }
                        System.out.print("\n");
                    } break;
                case 4 :
                    System.exit(0);

            }
        }
    }
}
