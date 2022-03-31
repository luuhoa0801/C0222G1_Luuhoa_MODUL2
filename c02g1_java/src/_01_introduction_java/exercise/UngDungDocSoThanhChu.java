package _01_introduction_java.exercise;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Number : ");
        number = scanner.nextInt();

        int tram = number / 100;
        int chuc = (number / 10) % 10;
        int donVi = (number % 100) % 10 ;

        String a = "";
        String b = "";
        String c = "";
        String result ;

        switch (donVi){
            case 1:
               c = " One ";
                break;

            case 2 :
                c = " Two ";
                break;
            case 3 :
                c = " Three ";
                break;
            case 4 :
                c = " Four ";
                break;
            case 5 :
               c = " Five ";
                break;
            case 6 :
                c =" Six ";
                break;
            case 7 :
                c = " seven ";
                break;
            case 8 :
                c = " eight ";
                break;
            case 9 :
                c = " Nine ";
                break;
            case 0 :
                c = "";
                break;
        }


        switch (tram){
            case 0 :
                a = "";
                break;
            case 1 :
                a = " one hundred ";
                break;
            case 2 :
                a = " two hundred ";
                break;
            case 3 :
                a = " three hundred ";
                break;
            case 4 :
                a = " for hundred ";
                break;
            case 5 :
                a = " five hundred ";
                break;
            case 6 :
                a = " six hundred ";
            case 7 :
                a = " seven hundred ";
                break;
            case 8 :
                a = " eight hundred ";
                break;
            case 9 :
                a = " nine hundred ";
                break;
        }

        if (chuc == 1 ){
            switch (donVi){
                case 1 :
                    b = " eleven ";
                    break;
                case 2 :
                    b = " twelve ";
                    break;
                case 3 :
                    b = " thirteen ";
                    break;
                case 4 :
                    b = " fourteen ";
                    break;
                case 5 :
                    b = " fifteen ";
                    break;
                case 6 :
                    b = " sixteen ";
                    break;
                case 7 :
                    b = " seventeen " ;
                    break;
                case 8 :
                    b = " eighteen ";
                    break;
                case  9 :
                    b = " nineteen ";
                    break;
                case 0 :
                    b = " ten ";
            }
        } else {
            switch (chuc){

                case 2 :
                    b = " twenty ";
                    break;
                case 3 :
                    b = "thirty";
                    break;
                case 4 :
                    b = "forty";
                    break;
                case 5 :
                    b = " fifty ";
                    break;
                case 6 :
                    b = " sixty ";
                    break;
                case 7 :
                    b = " seventy ";
                    break;
                case 8 :
                    b = " eighty ";
                    break;
                case 9 :
                    b = " ninety ";
                    break;

            }
        }

        if ( chuc == 1 ){
            System.out.println( a + b );
        } else {
            System.out.println(a + b + c);
        }


    }


}
