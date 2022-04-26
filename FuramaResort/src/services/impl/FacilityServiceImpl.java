package services.impl;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.FacilityService;
import utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_ID_VILLA = "^(SVVL)[-][0-9]{4}$";
    private static final String REGEX_ID_HOUSE = "^(SVHO)[-][0-9]{4}$";
    private static final String REGEX_ID_ROM = "^(SVRO)[-][0-9]{4}$";
    private static final String REGEX_STR = "[A-Z][a-z]+";
    private static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    private static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    private static final String REGEX_AREA = "^([3-9][0-9]|[1-9][0-9]{2,})$";
    private static final String REGEX_FOOL = "^[1-9]|([1][0-9]{1,})$";
    private static final String REGEX_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)" +
            "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
            "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]" +
            "|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\" +
            "4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$." + "";


    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> item: facilityIntegerMap.entrySet()) {
            System.out.println("Service " + item.getKey() + "Số lần thuê: " + item.getValue());
        }
    }

    @Override
    public void displayMaintenance() {

    }
    private String inputIdVilla(){
        System.out.println("Nhập id, mã dịch vụ Villa: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_ID_VILLA,"Bạn đã nhập sai định dạng," +
                "phải có dạng SVVL-XXXX");
    }
    private String inputIdHouse(){
        System.out.println("Nhập id, mã dịch vụ House: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_ID_HOUSE,"Bạn đã nhập sai định dạng," +
                "phải có dạng SVHO-XXXX");
    }
    private String inputIdRom(){
        System.out.println("Nhập id, mã dịch vụ Rom: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_ID_ROM,"Bạn đã nhập sai định dạng," +
                "phải có dạng SVRO-XXXX");
    }

    private String inputName(){
        System.out.println("Nhập tên dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng," +
                " tên bắt đầu bằng chữ viết Hoa đầu tiên");
    }
    private String inputStyleRent(){
        System.out.println("Nhập kiểu thuê: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng," +
                " kiểu thuê bắt đầu bằng chữ viết Hoa đầu tiên");
    }
    private String inputStandard(){
        System.out.println("Nhập tiêu chuẩn phòng: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng," +
                " tiêu chuẩn phòng bắt đầu bằng chữ viết Hoa đầu tiên");
    }

    private String inputArea(){
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA,"Bạn đã nhập sai, diện tích phải lớn hơn 30 ");
    }
    private String inputPrice(){
        System.out.println("Nhập giá tiền: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT,"Bạn đã nhập sai,giá tiền phải là số dương ");
    }
    private String inputFool(){
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_FOOL,"Bạn đã nhập sai,giá tiền phải là số dương ");
    }
    private String inputPeople(){
        System.out.println("Nhập số lượng người: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT,"Bạn đã nhập sai,số lượng người phải là số dương ");
    }




    @Override
    public void addNewVilla() {

//        boolean flag = true;
//        Set<Facility> facilitySet = facilityIntegerMap.keySet();
//        for (Facility item : facilitySet) {
//            if (item.getIdFacility().equals(idFacility)) {
//                flag = false;
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("Đã có Villa này với ID đã nhập");
//        } else {

        String idFacility = inputIdVilla();

        String nameService = inputName();
        int areaUse;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng: ");
                areaUse = Integer.parseInt(scanner.nextLine());
                if (areaUse > 30){
                    break;
                }else {
                    System.out.println("Diện tích sử dụng phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        int expenseRent;
        while (true) {
            try {
                System.out.println("Nhập số tiền thuê: ");
                expenseRent = Integer.parseInt(scanner.nextLine());
                if (expenseRent > 0){
                    break;
                }else {
                    System.out.println("Tiền phải là số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        int maxNumberPeople;
        while (true) {
            try {
                System.out.println("Nhập số người: ");
                maxNumberPeople = Integer.parseInt(scanner.nextLine());
                if ( 0 < maxNumberPeople && maxNumberPeople < 20 ){
                    break;
                }else {
                    System.out.println("Nhập sai số người");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        String styleRent = inputStyleRent();

        String standardVilla = inputStandard();

        int areaPool;
        while (true) {
            try {
                System.out.println("Nhập diện tích hồ bơi: ");
                areaPool = Integer.parseInt(scanner.nextLine());
                if ( areaPool > 30 ){
                    break;
                }else {
                    System.out.println("Diện tích hồ bơi phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        int numberFloor;
        while (true) {
            try {
                System.out.println("Nhập số tầng: ");
                numberFloor = Integer.parseInt(scanner.nextLine());
                if ( numberFloor > 0 ){
                    break;
                }else {
                    System.out.println("Số tầng là số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        Villa villa = new Villa(idFacility, nameService, areaUse,
                expenseRent, maxNumberPeople, styleRent,
                standardVilla, areaPool, numberFloor);
        facilityIntegerMap.put(villa, 0);

        System.out.println("Đã thêm mới Villa thành công");
    }



    @Override
    public void addNewHouse() {

        String idFacility = inputIdHouse();

//        boolean flag = true;
//        Set<Facility> facilitySet = facilityIntegerMap.keySet();
//        for (Facility item : facilitySet) {
//            if (item.getIdFacility().equals(idFacility) ) {
//                flag = false;
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("Đã có House với ID bạn vừa nhập");
//        } else {

        String nameService = inputName();

        int areaUse;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng: ");
                areaUse = Integer.parseInt(scanner.nextLine());
                if (areaUse > 30){
                    break;
                }else {
                    System.out.println("Diện tích sử dụng phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        int expenseRent;
        while (true) {
            try {
                System.out.println("Nhập số tiền thuê: ");
                expenseRent = Integer.parseInt(scanner.nextLine());
                if (expenseRent > 0){
                    break;
                }else {
                    System.out.println("Tiền phải là số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        int maxNumberPeople;
        while (true) {
            try {
                System.out.println("Nhập số người: ");
                maxNumberPeople = Integer.parseInt(scanner.nextLine());
                if ( 0 < maxNumberPeople && maxNumberPeople < 20 ){
                    break;
                }else {
                    System.out.println("Nhập sai số người");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        String styleRent = inputStyleRent();

        String standardHouse = inputStandard();

        int numberFloor;
        while (true) {
            try {
                System.out.println("Nhập số tầng: ");
                numberFloor = Integer.parseInt(scanner.nextLine());
                if ( numberFloor > 0 ){
                    break;
                }else {
                    System.out.println("Số tầng là số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        House house = new House(idFacility, nameService, areaUse,
                expenseRent, maxNumberPeople, styleRent,
                standardHouse, numberFloor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới House thành công");
    }

    @Override
    public void addNewRoom() {


//        boolean flag = true;
//        Set<Facility> facilitySet = facilityIntegerMap.keySet();
//        for (Facility item : facilitySet) {
//            if (item.getIdFacility().equals(idFacility)  ) {
//                flag = false;
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("Đã có Room với ID bạn vừa nhập");
//        } else {

        String idFacility = inputIdRom();

        String nameService = inputName();

        int areaUse;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng: ");
                areaUse = Integer.parseInt(scanner.nextLine());
                if (areaUse > 30) {
                    break;
                } else {
                    System.out.println("Diện tích sử dụng phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        int expenseRent;
        while (true) {
            try {
                System.out.println("Nhập số tiền thuê: ");
                expenseRent = Integer.parseInt(scanner.nextLine());
                if (expenseRent > 0) {
                    break;
                } else {
                    System.out.println("Tiền phải là số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        int maxNumberPeople;
        while (true) {
            try {
                System.out.println("Nhập số người: ");
                maxNumberPeople = Integer.parseInt(scanner.nextLine());
                if (0 < maxNumberPeople && maxNumberPeople < 20) {
                    break;
                } else {
                    System.out.println("Nhập sai số người");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        String styleRent = inputStyleRent();

        System.out.println("Dịch vụ miến phí đi kèm: ");
        String freeServiceIncluded = scanner.nextLine();

        Room room = new Room(idFacility, nameService, areaUse, expenseRent,
                maxNumberPeople, styleRent, freeServiceIncluded);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới Room thành công");
    }
}

