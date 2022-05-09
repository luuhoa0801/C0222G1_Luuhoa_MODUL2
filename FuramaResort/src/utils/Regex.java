package utils;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    //  Luu hoa...regex name
    public static final String REGEX_NAME = "^([A-Za-z]+)((\\s{1}[A-Za-z]+){1,})$";
    private static final String REGEX_ID_ROM = "^(SVRO)[-][0-9]{4}$";
    private static final String REGEX_PHONE = "^(84|0[3|5|7|8|9])+([0-9]{8})$";
    private static final String REGEX_ID_VILLA = "^(SVVL)[-][0-9]{4}$";
    private static final String REGEX_ID_HOUSE = "^(SVHO)[-][0-9]{4}$";
    private static final String REGEX_STR = "[A-Z][a-z]+";
    private static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    private static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    private static final String REGEX_AREA = "^([3-9][0-9]|[1-9][0-9]{2,})$";
    private static final String REGEX_FOOL = "^[1-9]|([1][0-9]{1,})$";
    public static final String REGEX_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)" +
            "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
            "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]" +
            "|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\" +
            "4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static String inputMyName(){
        return RegexData.regexStr(scanner.nextLine(),REGEX_NAME,"Bạn đã nhập sai định dạng," +
                "ko quá 2 dấu cách");
    }
    public static String inputIdRom() {
        System.out.println("Nhập id, mã dịch vụ Rom: ( SVRO-XXXX ) ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROM, "Bạn đã nhập sai định dạng," +
                "phải có dạng SVRO-XXXX");
    }
    public static String inputPhone(){
        return RegexData.regexStr(scanner.nextLine(),REGEX_PHONE,"Bạn đã nhập sai định dạng,phải bắt đầu từ số 0");
    }
    public static String inputIdVilla() {
        System.out.println("Nhập id, mã dịch vụ Villa: ( SVVL-XXXX ) ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai định dạng," +
                "phải có dạng SVVL-XXXX");
    }

    public static String inputIdHouse() {
        System.out.println("Nhập id, mã dịch vụ House: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "Bạn đã nhập sai định dạng," +
                "phải có dạng SVHO-XXXX");
    }
    public static String inputName() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng," +
                " tên bắt đầu bằng chữ viết Hoa đầu tiên");
    }

    public static String inputStyleRent() {
        System.out.println("Nhập kiểu thuê: ( Day  Month  Year ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng," +
                " kiểu thuê bắt đầu bằng chữ viết Hoa đầu tiên");
    }

    public static String inputStandard() {
        System.out.println("Nhập tiêu chuẩn phòng:( Vip  Nomarl ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng," +
                " tiêu chuẩn phòng bắt đầu bằng chữ viết Hoa đầu tiên");
    }

    public static String inputArea() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai, diện tích phải lớn hơn 30 ");
    }

    public static String inputPrice() {
        System.out.println("Nhập giá tiền: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai,giá tiền phải là số dương ");
    }

    public static String inputFool() {
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_FOOL, "Bạn đã nhập sai,giá tiền phải là số dương ");
    }

    public static String inputPeople() {
        System.out.println("Nhập số lượng người: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT, "Bạn đã nhập sai,số lượng người phải là số dương ");
    }
}
