package services.impl;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.FacilityService;
import utils.ReadAndWrite;
import utils.Regex;
import utils.RegexData;

import javax.print.DocFlavor;
import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    private static List<Villa> villaList = new ArrayList<>();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();

    static final String FILE_VILLA = "src\\data\\facility\\villa.csv";
    static final String FILE_HOUSE = "src\\data\\facility\\house.csv";
    static final String FILE_ROOM = "src\\data\\facility\\room.csv";

    @Override
    public void display() {
//        for (String house : ReadAndWrite.readFileCsv(FILE_HOUSE)) {
//            System.out.println(house);
//        }
        displayVilla();
        displayHouse();
        displayRoom();
        for (Map.Entry<Facility,Integer> item: facilityIntegerMap.entrySet()) {
            System.out.println("Service " + item.getKey() + "Số lần thuê: " + item.getValue());
        }
    }

    @Override
    public void displayMaintenance() {
        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            if (item.getValue() >= 5) {
                System.out.println("Service cần bảo trì: " + item.getKey() + "số lần thuê" + item.getValue());
            }
        }
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


        String idFacility = Regex.inputIdVilla();
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = Regex.inputName();
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

        String styleRent = Regex.inputStyleRent() ;

        String standardVilla =Regex.inputStandard();

        int areaPool;
        while (true) {
            try {
                System.out.println("Nhập diện tích hồ bơi: ");
                areaPool = Integer.parseInt(scanner.nextLine());
                if (areaPool > 30) {
                    break;
                } else {
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
                if (numberFloor > 0) {
                    break;
                } else {
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
        villaList.add(villa);
        String line = "";
        for (Villa item : villaList) {
            line += item.getIdFacility() + "," + item.getNameService() + "," + item.getAreaUse() + "," + item.getExpenseRent()
                    + "," + item.getMaxNumberPeople() + "," + item.getStyleRent() + "," + item.getStandardVilla()
                    + "," + item.getAreaFool() + "," + item.getNumberFloor() + "\n";
        }

        System.out.println("Đã thêm mới Villa thành công");
        ReadAndWrite.writeFile(FILE_VILLA, line);
    }


    @Override
    public void addNewHouse() {

        String idFacility = Regex.inputIdHouse();

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

        String nameService =Regex.inputName();

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

        String styleRent =Regex.inputStyleRent();

        String standardHouse =Regex.inputStandard();

        int numberFloor;
        while (true) {
            try {
                System.out.println("Nhập số tầng: ");
                numberFloor = Integer.parseInt(scanner.nextLine());
                if (numberFloor > 0) {
                    break;
                } else {
                    System.out.println("Số tầng là số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        House house = new House(idFacility, nameService, areaUse,
                expenseRent, maxNumberPeople, styleRent,
                standardHouse, numberFloor);
        houseList.add(house);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới House thành công");
        String line = "";
        for (House item : houseList) {
            line += item.getIdFacility() + "," + item.getNameService() + "," + item.getAreaUse() + "," + item.getExpenseRent()
                    + "," + item.getMaxNumberPeople() + "," + item.getStyleRent() + "," + item.getStandardHouse() + ","
                    + item.getNumberFloor() + "\n";
        }
        ReadAndWrite.writeFile(FILE_HOUSE, line);
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

        String idFacility =Regex.inputIdRom();

        String nameService =Regex.inputName();

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

        String styleRent =Regex.inputStyleRent();

        System.out.println("Dịch vụ miến phí đi kèm: ");
        String freeServiceIncluded = scanner.nextLine();

        Room room = new Room(idFacility, nameService, areaUse, expenseRent,
                maxNumberPeople, styleRent, freeServiceIncluded);
        facilityIntegerMap.put(room, 0);
        roomList.add(room);
        System.out.println("Đã thêm mới Room thành công");
        String line = "";
        for (Room item : roomList) {
            line += item.getIdFacility() + "," + item.getNameService() + "," + item.getAreaUse() + "," + item.getExpenseRent()
                    + "," + item.getMaxNumberPeople() + "," + item.getMaxNumberPeople() + "," + item.getStyleRent() + "," +
                    item.getFreeServiceIncluded();
        }
        ReadAndWrite.writeFile(FILE_ROOM, line);
    }

    @Override
    public void displayHouse() {
        List<String[]> strListHouse = ReadAndWrite.readFile(FILE_HOUSE);
        House house;
        if (strListHouse != null) {
            for (String[] item : strListHouse) {
                house = new House(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]),
                        item[5], item[6], Integer.parseInt(item[7]));
                houseList.add(house);
                facilityIntegerMap.put(house, 0);
            }
        }
    }

    @Override
    public void displayRoom() {
        List<String[]> strListRoom = ReadAndWrite.readFile(FILE_ROOM);
        Room room;
        if (strListRoom != null) {
            for (String[] item : strListRoom) {
                room = new Room(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3])
                        , Integer.parseInt(item[4]), item[5], item[6]);
                roomList.add(room);
                facilityIntegerMap.put(room, 0);
            }
        }
    }

    @Override
    public void displayVilla() {
        List<String[]> strListVilla = ReadAndWrite.readFile(FILE_VILLA);
        facilityIntegerMap.clear();
        Villa villa;
        if (strListVilla != null) {
            for (String[] item : strListVilla) {
                villa = new Villa(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3]),
                        Integer.parseInt(item[4]), item[5], item[6], Integer.parseInt(item[7]), Integer.parseInt(item[8]));
                villaList.add(villa);
                facilityIntegerMap.put(villa, 0);
            }
        }
    }
}

