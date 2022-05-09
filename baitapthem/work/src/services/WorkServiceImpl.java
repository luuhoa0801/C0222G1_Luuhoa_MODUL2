package services;

import models.Work;
import utils.CompareByOrder;
import utils.CompareByPriority;
import utils.ReadAndWrite;
import utils.Regex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkServiceImpl implements WorkService{

    static Scanner scanner = new Scanner(System.in);
    public static final String FILE_WORK = "src\\data\\work.csv";
    public static final String REGEX_ID = "^TASK-[0-9]{4}$";
    //TASK-XXXX

    static List<Work> stringList = getWork();

    public static List<Work> getWork() {
        List<Work> workList = new ArrayList<>();
        List<String[]> strList = ReadAndWrite.read(FILE_WORK);
        for (String[] item : strList) {
            Work work = new Work(item[0],item[1],item[2],item[3],item[4]);
            workList.add(work);
        }
        return workList;
    }
    public void updateFile(){
        List<String> stringList1 = new ArrayList<>();
        for ( Work item : stringList) {
            stringList1.add(item.getLine());
        }
        File file = new File(FILE_WORK);
        file.delete();
        ReadAndWrite.write(FILE_WORK,stringList1);
    }

    public void displayByPriority(){
        CompareByPriority compare = new CompareByPriority();
        stringList.sort(compare);
        for (Work item : stringList) {
            System.out.println(item.toString());
        }

    }

    public void displayByOrder() {
        CompareByOrder compareByOrder = new CompareByOrder();
        stringList.sort(compareByOrder);
        for (Work item : stringList) {
            System.out.println(item.toString());
        }
    }


    @Override
    public void addWork() {
        System.out.println("Nhập mã môn học,định dạng TASK-XXXX :  ");
        String id;

        while (true) {
            while (true) {
                id = Regex.checkRegex(REGEX_ID);
                break;
            }
             boolean check = true;
            for (Work item : stringList) {
                if (item.getIdWork().equals(id)) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("Đã có công việc này với ID vừa nhập");
            }else {
                break;
            }
        }

        System.out.println("Nhập tên công việc");
        String name = scanner.nextLine();

        String day = "";
        boolean flag = true;
        while (flag) {
            System.out.println("1. Thứ 2 ");
            System.out.println("2. Thứ 3 ");
            System.out.println("3. Thứ 4 ");
            System.out.println("4. Thứ 5 ");
            System.out.println("5. Thứ 6 ");
            System.out.println("6. Thứ 7 ");
            System.out.println("7. CN ");
            System.out.println("Mời bạn chọn ngày: ");
            switch (scanner.nextLine()) {
                case "1":
                    day += "Thứ 2";
                    flag = false;
                    break;
                case "2":
                    day += "Thứ 3";
                    flag = false;
                    break;
                case "3":
                    day += "Thứ 4";
                    flag = false;
                    break;
                case "4":
                    day += "Thứ 5";
                    flag = false;
                    break;
                case "5":
                    day += "Thứ 6";
                    flag = false;
                    break;
                case "6":
                    day += "Thứ 7";
                    flag = false;
                    break;
                case "7":
                    day += "CN";
                    flag = false;
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
            }
        }
        System.out.println("Nhập mức độ ưu tiên ");
        String byPriority = "";
        boolean flag1 = true;
        while (flag1) {
            System.out.println("1: High");
            System.out.println("2: Normal");
            System.out.println("3: Low");
            switch (scanner.nextLine()) {
                case "1":
                    byPriority += "High";
                    flag1 = false;
                    break;
                case "2":
                    byPriority += "Normal";
                    flag1 = false;
                    break;
                case "3":
                    byPriority += "Low";
                    flag1 = false;
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        }
        System.out.println("Nhập thông tin công việc");
        String status = scanner.nextLine();

        Work work = new Work(id, name, day, byPriority, status);
        stringList.add(work);
        updateFile();

    }


    @Override
    public void update() {
        stringList = getWork();
        System.out.println("Nhập id muốn update");
        String id;
        boolean check = true;
        while (check){
            id = Regex.checkRegex(REGEX_ID);
            for (Work item: stringList) {
                if (item.getIdWork().equals(id)){
                    check = false;
                    item.setStatus("Đã làm xong công việc");
                    updateFile();
                    break;
                }
            }
            if (check){
                System.out.println("KHÔNG CÓ ID NÀY");
            }
        }
    }

}
