package services.impl;

import models.person.Employee;
import services.EmployeeService;
import utils.ReadAndWrite;
import utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_STR = "[A-Z][a-z]+";
    private static final String REGEX_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)" +
            "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3" +
            "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$" +
            "|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$." + "";
    private String inputName(){
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng," +
                " tên bắt đầu bằng chữ viết Hoa đầu tiên");
    }
    @Override
    public void display() {
        for (Employee employee: employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id nhân viên: ");
        String idEmployee = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getIdEmployee().equals(idEmployee)){
                flag = false;
                break;
            }
        }
        if (!flag){
            System.out.println("Đã có nhân viên này !!!");
        }else {
            System.out.println("Nhập tên: ");
            String name = inputName();

            System.out.println("Nhập tuổi: ");
            String dateOfBirth = RegexData.regexAge(scanner.nextLine(),REGEX_DATE);


            System.out.println("Nhập giới tính: 1:Nam   2:Nữ ");
            String gender;
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice==1){
                gender = "Nam";
            }else {
                gender = "Nữ";
            }
            System.out.println("Nhập chứng minh nhân dân: ");
            int idCard = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số điện thoại: ");
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập email: ");
            String email = scanner.nextLine();

            System.out.println("Nhập trình độ:1:Trung cấp  2:Cao đẳng  3:Đại học  4:Sau đại học ");
            int result = Integer.parseInt(scanner.nextLine());
            String  level= "";
            boolean flag1 =true;
            while (flag1){
                switch (result){
                    case 1:
                        level += "Trung cấp";
                        flag1 = false;
                        break;
                    case 2:
                        level += "Cao đẳng";
                        flag1 = false;
                        break;
                    case 3:
                        level += "Đại học";
                        flag1 = false;
                        break;
                    case 4:
                        level += "Sau đại học";
                        flag1 = false;
                        break;
                }
            }
            System.out.println("Nhập vị trí: 1:Lễ tân  2:Phục vụ  3:Chuyên viên  4:giám sát" +
                    " 5:quản lý  6:giám đốc");
            int output = Integer.parseInt(scanner.nextLine());
            String position= "";
            boolean flag2 =true;
            while (flag2){
                switch (output){
                    case 1:
                        position += "Lễ tân";
                        flag2 = false;
                        break;
                    case 2:
                        position += "Phục vụ";
                        flag2 =false;
                        break;
                    case 3:
                        position += "Chuyên viên";
                        flag2=false;
                        break;
                    case 4:
                        position += "giám sát";
                        flag2 = false;
                        break;
                    case 5:
                        position += "Quản lý";
                        flag2 = false;
                        break;
                    case 6:
                        position += "giám đốc";
                        flag2 = false;
                        break;
                }
            }

//            System.out.println("Nhập tiền lương: ");
//            int salary = Integer.parseInt(scanner.nextLine());
            int salary;
            while (true) {
                try {
                    System.out.println("Nhập số lương: ");
                    salary = Integer.parseInt(scanner.nextLine());
                    if (salary > 0) {
                        break;
                    } else {
                        System.out.println("Tiền lương là số nguyên dương");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            Employee employee = new Employee(name,dateOfBirth,gender,idCard,phoneNumber,email,
                    idEmployee,level,position,salary);
            employeeList.add(employee);
//            String line = name +","+ dateOfBirth +","+ gender +","+ idCard +","+ phoneNumber +","+ email +
//                    ","+ idEmployee +","+ level +","+ position +","+ salary;

            ReadAndWrite.writeFile("src\\data\\employee.csv",employeeList);
            System.out.println("Thêm thành công !");
            display();
        }

    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên: ");
        String id = scanner.nextLine();
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getIdEmployee().equals(id) ){
                System.out.println("Đã có nhân viên với id này: ");
//                employeeList.remove(i);

                System.out.println("Nhập tên nhân viên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi nhân viên: ");
                String dateOfBirth = RegexData.regexAge(scanner.nextLine(),REGEX_DATE);
                System.out.println("Nhập giới tính: 1:Nam   2:Nữ ");
                String gender;
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice==1){
                    gender = "Nam";
                }else {
                    gender = "Nữ";
                }
                System.out.println("Nhập chứng minh nhân dân nhân viên: ");
                int idCard = Integer.parseInt(scanner.nextLine());;
                System.out.println("Nhập số điện thoại nhân viên: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());;
                System.out.println("Nhập email nhân viên: ");
                String email = scanner.nextLine();
                System.out.println("Nhập trình độ:1:Trung cấp  2:Cao đẳng  3:Đại học  4:Sau đại học ");
                int result = Integer.parseInt(scanner.nextLine());
                String  level= "";
                boolean flag =true;
                while (flag){
                    switch (result){
                        case 1:
                            level += "Trung cấp";
                            flag = false;
                            break;
                        case 2:
                            level += "Cao đẳng";
                            flag = false;
                            break;
                        case 3:
                            level += "Đại học";
                            flag = false;
                            break;
                        case 4:
                            level += "Sau đại học";
                            flag = false;
                            break;
                    }
                }
                System.out.println("Nhập vị trí : 1:Lễ tân  2:Phục vụ  3:Chuyên viên  4:Giám sát" +
                        " 5:quản lý  6:giám đốc");
                int output = Integer.parseInt(scanner.nextLine());
                String position= "";
                boolean flag2 =true;
                while (flag2){
                    switch (output){
                        case 1:
                            position += "Lễ tân";
                            flag2 = false;
                            break;
                        case 2:
                            position += "Phục vụ";
                            flag2 =false;
                            break;
                        case 3:
                            position += "Chuyên viên";
                            flag2=false;
                            break;
                        case 4:
                            position += "giám sát";
                            flag2 = false;
                            break;
                        case 5:
                            position += "Quản lý";
                            flag2 = false;
                            break;
                        case 6:
                            position += "giám đốc";
                            flag2 = false;
                            break;
                    }
                }
                System.out.println("Nhập tiền lương nhân viên: ");
                int salary = Integer.parseInt(scanner.nextLine());
                Employee employee = new Employee(name,dateOfBirth,gender,idCard,phoneNumber,email,
                                                 id,level,position,salary);
                employeeList.set(i, employee);
                System.out.println("Cập nhật thành công thông tin !");
                ReadAndWrite.writeFile("src\\data\\employee.csv",employeeList);
                break;

            }else {
                System.out.println("Không có nhân viên này !!");
            }
        }

    }

    @Override
    public void delete() {
        System.out.println("Nhập id nhân viên muốn xóa: ");
        String id = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getIdEmployee().equals(id) ){
                employeeList.remove(i);
                flag = false;
                break;
            }
            System.out.println("Xóa thành công ! ");
        }
        if (!flag){
            System.out.println("Không có nhân viên này");
        }
    }
}
