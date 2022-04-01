package _01_introduction_java.exercise;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input money USD");
        usd = scanner.nextDouble();
        double rate;
        rate = usd * vnd;
        System.out.println("USD ->vnd : "+rate);
    }
}

