package utils;

import java.util.Map;
import java.util.Scanner;

public class Regex {

    public static Scanner scanner = new Scanner(System.in);

    public static String checkRegex(String regex) {
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(regex)) {
                return id;
            }else {
                System.err.println("Sai định dạng.");
            }
        }
    }

}
