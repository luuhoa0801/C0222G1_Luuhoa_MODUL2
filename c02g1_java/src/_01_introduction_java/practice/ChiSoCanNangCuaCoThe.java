package _01_introduction_java.practice;

import java.util.Scanner;

public class ChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;

        System.out.println("weight ( in kilogram) : ");
        weight = scanner.nextDouble();
        System.out.println("height (in met) : ");
        height = scanner.nextDouble();

        bmi = weight / (Math.pow(height,2));
        System.out.println("bmi = "+ bmi);

//        System.out.printf("%-20.2fs%s", bmi, "Interpretation\n");

        if (bmi < 18){
            System.out.printf("%-20.2fs%s",bmi,"Underweight");
        }else if (bmi < 25.0){
            System.out.printf("%-20.2fs%s",bmi,"Normal");
        }else if (bmi < 30.0){
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        } else {
            System.out.printf("%-20.2f%s",bmi,"Obese");
        }

    }


}
