package _19_string_and_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;
    private static final String valid = "(84)-(0978489641)";
    private static final String invalid = "(a8)-(22222222)";

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        boolean isvalid = phoneNumberExample.validate(valid);
        System.out.println("PhoneNumberExample " +valid+" isvalid: "+isvalid);
        boolean isinvalid = phoneNumberExample.validate(invalid);
        System.out.println("PhoneNumberExample "+invalid+" isinvalid: "+isinvalid);
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        boolean check = phoneNumberExample.validate(str);
//        System.out.println(check);
    }
}
