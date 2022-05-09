package utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    //    public static String regexDate(String temp, String regex) {
//        while (true) {
//            if (temp.matches(regex)) {
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                LocalDate date = LocalDate.parse(temp, formatter);
//                LocalDate now = LocalDate.now();
//                now.format(formatter);
//                int currentDay = Period.between(now, date).getDays();
//                if (currentDay > 0) {
//                    return temp;
//                } else {
//                    System.err.println("day > " + now.toString());
//                }
//            } else {
//                System.err.println("Error format date");
//            }
//            System.out.println("Enter date again: ");
//            temp = scanner.nextLine();
//        }
//    }
    public static void dateTimeCheck(String time) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate startTime = LocalDate.parse(time, formatter);
        LocalDate timeNow = LocalDate.now();
        timeNow.format(formatter);

        if (startTime.isBefore(timeNow)) {
            throw new Exception();
        }
    }
}


