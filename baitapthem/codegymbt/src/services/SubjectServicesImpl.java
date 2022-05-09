package services;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import models.SubjectDemo;
import utils.ComparatorTime;
import utils.Exception1;
import utils.ReadAndWrite;

import java.io.File;
import java.util.*;

public class SubjectServicesImpl implements SubjectServices {

    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_ID = "^BC-[A-Z]{4}$";
    public static final String REGEX_VERSION = "^[0-9].[0-9]$";
    public static final String FILE_SUBJECT = "src\\data\\subject.csv";

    static List<SubjectDemo> stringList = getSubject();

    public static List<SubjectDemo> getSubject() {
        List<SubjectDemo> subjectDemos = new ArrayList<>();
        List<String[]> strList = ReadAndWrite.read(FILE_SUBJECT);
        for (String[] item : strList) {
            SubjectDemo sub = new SubjectDemo(item[0], item[1], item[2], item[3], Integer.parseInt(item[4]));
            subjectDemos.add(sub);
        }
        return subjectDemos;
    }

    public void updateFile(){
        List<String> stringList1 = new ArrayList<>();
        for ( SubjectDemo item : stringList) {
            stringList1.add(item.getLine());
        }
        File file = new File(FILE_SUBJECT);
        file.delete();
        ReadAndWrite.write(FILE_SUBJECT,stringList1);
    }

    @Override
    public void displaySubject() {
        stringList = getSubject();

        for (SubjectDemo item : stringList) {
            System.out.println(item.toString());
        }
    }
    public void sortTime(){
        ComparatorTime comparatorTime = new ComparatorTime();
        Collections.sort(stringList,comparatorTime);
        updateFile();

    }


    @Override
    public void addNewSubject() {
        System.out.println("Nhập mã môn học,định dạng BC-YYYY :  ");
        String id;
        boolean check = true;
        while (true) {
            id = scanner.nextLine();
            if (id.matches(REGEX_ID)) {
                break;
            } else {
                System.out.println("Bạn đã nhập sai định dạng");
            }
        }

        for (SubjectDemo item : stringList) {
            if (item.getIdSubject().equals(id)) {
                check = false;
                break;
            }
        }
        if (!check) {
            System.out.println("Đã có môn học này với mã vừa nhập");
        } else {
            System.out.println("Nhập tên môn học");
            String nameSubject = scanner.nextLine();

            System.out.println("Nhập phiên bản ");
            String version;
            while (true) {
                version = scanner.nextLine();
                if (version.matches(REGEX_VERSION)) {
                    break;
                } else {
                    System.out.println("Bạn đã nhập sai định dạng,đúng là X.X");
                }
            }

            System.out.println("Nhập độ khó 1:DẼ    2:VỪA   3:KHÓ");
            boolean flag = true;
            String level = "";
            while (flag) {
                switch (scanner.nextLine()) {
                    case "1":
                        level += "DỄ";
                        flag = false;
                        break;
                    case "2":
                        level += "VỪA";
                        flag = false;
                        break;
                    case "3":
                        level += "KHÓ";
                        flag = false;
                        break;
                    default:
                        System.out.println("Mời nhập lại");
                }
            }
            System.out.println("Nhập thời lượng học: ");
            int time;
            while (true) {
                try {
                    time = Integer.parseInt(scanner.nextLine());
                    if (time > 0) {
                        break;
                    } else {
                        System.out.println("thời gian học là số nguyên dương");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            SubjectDemo subjectDemo = new SubjectDemo(id,nameSubject,version,level,time);
            stringList.add(subjectDemo);
            updateFile();

        }
    }

    @Override
    public void editSubject() {
        stringList = getSubject();
        displaySubject();

        System.out.println("Nhập mã môn học,định dạng BC-YYYY : ");
        String idSubject;

        while (true) {
            idSubject = scanner.nextLine();
            if (idSubject.matches(REGEX_ID)) {
                break;
            } else {
                System.out.println("Bạn đã nhập sai định dạng, đúng là định dạng BC-YYYY");
            }
        }
        boolean check1 = false;

        int index = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals((idSubject))) {
                index = i;
                check1 = true;
                break;
            }
        }
        if (check1) {
            System.out.println("Không có môn học với mã này");
        } else {
            System.out.println("Nhập tên môn học");
            String nameSubject = scanner.nextLine();
            stringList.get(index).setNameSubject(nameSubject);

            System.out.println("Nhập phiên bản ");
            String version;

            while (true) {
                version = scanner.nextLine();
                if (version.matches(REGEX_VERSION)) {
                    break;
                } else {
                    System.out.println("Bạn đã nhập sai định dạng,đúng là X.X");
                }
            }
            stringList.get(index).setVersion(version);

            System.out.println("Nhập độ khó 1:DẼ    2:VỪA   3:KHÓ");
            boolean flag = true;
            String level = "";
            while (flag) {
                switch (scanner.nextLine()) {
                    case "1":
                        level += "DỄ";
                        flag = false;
                        break;
                    case "2":
                        level += "VỪA";
                        flag = false;
                        break;
                    case "3":
                        level += "KHÓ";
                        flag = false;
                        break;
                    default:
                        System.out.println("Mời nhập lại");
                }
            }
            stringList.get(index).setVersion(level);

            int time;
            while (true) {
                try {
                    System.out.println("Nhập thời lượng học: ");
                    time = Integer.parseInt(scanner.nextLine());
                    if (time > 0) {
                        break;
                    } else {
                        System.out.println("thời gian học là số nguyên dương");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            stringList.get(index).setTime(time);

//            File file = new File(FILE_SUBJECT);
//            file.delete();
//            List<String> stringList1 = new ArrayList<>();
//            for (SubjectDemo item : stringList) {
//                stringList1.add(item.getLine());
//            }
//            ReadAndWrite.write(FILE_SUBJECT, stringList1);
            updateFile();
            System.out.println("Cập nhật thành công môn học!!!");
        }
    }

    @Override
    public void deleteSubject() {
        stringList = getSubject();
        displaySubject();

        System.out.println("Nhập mã môn học,định dạng BC-YYYY ");
        String idSubject;
        while (true) {
            idSubject = scanner.nextLine();
            if (idSubject.matches(REGEX_ID)) {
                break;
            } else {
                System.out.println("Bạn đã nhập sai định dạng");
            }
        }

        boolean check = false;
        SubjectDemo subjectDemo = null;
        try {
            for (SubjectDemo item : stringList) {
                if (item.getIdSubject().equals(idSubject)) {
                    subjectDemo = item;
                check = true;
                    break;
                }
            }

            if(!check){
               throw new Exception1();
            } else{
                stringList.remove(subjectDemo);
                System.out.println("Đã xóa thành công môn học này");
            }
        }catch (Exception1 e){
            System.out.println("Không có môn học với ID này");
        }
        updateFile();


//            File file = new File(FILE_SUBJECT);
//            file.delete();
//
//            List<String> strList = new ArrayList<>();
//
//            for (SubjectDemo item : stringList) {
//                strList.add(item.getLine());
//            }
//            ReadAndWrite.write(FILE_SUBJECT, strList);


//        else {
//            System.out.println("Không có môn học này");
//        }
    }
}

