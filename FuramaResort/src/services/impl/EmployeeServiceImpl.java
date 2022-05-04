package services.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import models.person.Customer;
import models.person.Employee;
import services.EmployeeService;
import utils.ReadAndWrite;
import utils.Regex;
import utils.RegexData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static List<String[]> strList ;
    static Scanner scanner = new Scanner(System.in);
    private static final String FILE_EMPLOY ="src\\data\\employee.csv";

    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();
        List<String[]> strList = ReadAndWrite.readFile(FILE_EMPLOY);

        for (String[] item: strList){
            Employee employee = new Employee((item[0]),(item[1]),(item[2]),Integer.parseInt(item[3]),
                    item[4], (item[5]),(item[6]),(item[7]),(item[8]),Integer.parseInt(item[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }
    @Override
    public void display() {
        employeeList = getEmployeeList();
        for (Employee employee: employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        employeeList = getEmployeeList();
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
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
            String name = Regex.inputName();

            System.out.println("Nhập tuổi: ");
            String dateOfBirth = null;
            try {
                dateOfBirth = RegexData.regexAge(scanner.nextLine(),Regex.REGEX_DATE);
            } catch (Exception e){
                e.printStackTrace();
            }

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
            String phoneNumber = Regex.inputPhone();
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


//            String line = "";
//            for ( Employee item: employeeList){
//                line += item.getName() +","+ item.getDateOfBirth() +","+item.getGender() +","+item.getIdCard()
//                        +","+ item.getPhoneNumber() +","+ item.getEmail()+
//                        ","+ item.getIdEmployee() +","+ item.getLevel() +","+ item.getPosition() +","+ item.getSalary() +"\n" ;
//            }
            ReadAndWrite.writeFile(FILE_EMPLOY,employee.getLine());
            System.out.println("Thêm khách hàng thành công !!!");
            display();

        }
    }

    @Override
    public void edit() {
        employeeList = getEmployeeList();
        display();

        System.out.println("Nhập id nhân viên: ");
        String id = scanner.nextLine();
        int index = 0;
        boolean check = true;
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getIdEmployee().equals(id)){
                index = i;
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Đã có nhân viên với id này: ");

            System.out.println("Nhập tên nhân viên: ");
            String name = Regex.inputName();
            employeeList.get(index).setName(name);

            System.out.println("Nhập tuổi nhân viên: ");
            String dateOfBirth = RegexData.regexAge(scanner.nextLine(),Regex.REGEX_DATE);
            employeeList.get(index).setAge(dateOfBirth);

            System.out.println("Nhập giới tính: 1:Nam   2:Nữ ");
            String gender;
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice==1){
                gender = "Nam";
            }else {
                gender = "Nữ";
            }
            System.out.println("Nhập chứng minh nhân dân nhân viên: ");
            int idCard = Integer.parseInt(scanner.nextLine());
            employeeList.get(index).setIdCard(idCard);

            System.out.println("Nhập số điện thoại nhân viên: ( bắt đầu bằng số 0 + 9 số ");
            String phoneNumber = Regex.inputPhone();
            employeeList.get(index).setPhoneNumber(phoneNumber);

            System.out.println("Nhập email nhân viên: ");
            String email = scanner.nextLine();
            employeeList.get(index).setEmail(email);

            System.out.println("Nhập trình độ:1:Trung cấp  2:Cao đẳng  3:Đại học  4:Sau đại học ");
            String result = scanner.nextLine();
            String  level= "";
            boolean flag =true;
            while (flag){
                switch (result){
                    case "1":
                        level += "Trung cấp";
                        flag = false;
                        break;
                    case "2":
                        level += "Cao đẳng";
                        flag = false;
                        break;
                    case "3":
                        level += "Đại học";
                        flag = false;
                        break;
                    case "4":
                        level += "Sau đại học";
                        flag = false;
                        break;
                }
            }
            System.out.println("Nhập vị trí : 1:Lễ tân  2:Phục vụ  3:Chuyên viên  4:Giám sát" +
                    " 5:quản lý  6:giám đốc");
            String output = scanner.nextLine();
            String position= "";
            boolean flag2 =true;
            while (flag2){
                switch (output){
                    case "1":
                        position += "Lễ tân";
                        flag2 = false;
                        break;
                    case "2":
                        position += "Phục vụ";
                        flag2 =false;
                        break;
                    case "3":
                        position += "Chuyên viên";
                        flag2=false;
                        break;
                    case "4":
                        position += "giám sát";
                        flag2 = false;
                        break;
                    case "5":
                        position += "Quản lý";
                        flag2 = false;
                        break;
                    case "6":
                        position += "giám đốc";
                        flag2 = false;
                        break;
                }
            }
            System.out.println("Nhập tiền lương nhân viên: ");
            int salary = Integer.parseInt(scanner.nextLine());
            employeeList.get(index).setSalary(salary);

            File file = new File(FILE_EMPLOY);
            file.delete();

            for (Employee item: employeeList) {
                ReadAndWrite.writeFile(FILE_EMPLOY,item.getLine());
            }
            System.out.println("Cập nhật thành công thông tin !");

        } else {
            System.out.println("Không có nhân viên này.");
        }

    }

    @Override
    public void delete() {

        employeeList = getEmployeeList();

        display();

        System.out.println("Nhập ID khách hàng: ");
        String id = scanner.nextLine();

        int index = 0;
        boolean check = false;
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getIdEmployee().equals(id)){
                index = i;
                check = true;
                break;
            }
        }

        if (check){
            employeeList.remove(index);
            System.out.println("Xóa thành công");
            File file = new File(FILE_EMPLOY);
            file.delete();

            for (Employee item: employeeList) {
                ReadAndWrite.writeFile(FILE_EMPLOY,item.getLine());
            }
        }else {
            System.out.println("Không có nhân viên với id này");
        }


    }
}
