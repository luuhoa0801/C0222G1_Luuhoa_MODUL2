package services.impl;

import models.person.Customer;
import models.person.Employee;
import services.CustomerService;
import utils.ReadAndWrite;
import utils.Regex;
import utils.RegexData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
//    private static final String REGEX_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)" +
//            "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
//            "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|" +
//            "[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))" +
//            "\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    static List<Customer> customersList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> strList = ReadAndWrite.readFile("src\\data\\customer.csv");
        customersList.clear();
        for ( String[] item: strList){
            Customer customer = new Customer(item[0],item[1],item[2],Integer.parseInt(item[3]),
                    (item[4]),item[5], item[6],item[7],item[8]);
            customersList.add(customer);
        }

        for (Customer customer: customersList ) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        List<String[]> strList = ReadAndWrite.readFile("src\\data\\customer.csv");
        customersList.clear();
        for ( String[] item: strList){
            Customer customer = new Customer(item[0],item[1],item[2],Integer.parseInt(item[3]),
                    (item[4]),item[5], item[6],item[7],item[8]);
            customersList.add(customer);
        }
        for ( Customer customer: customersList){
            System.out.println(customer);
        }

        System.out.println("Nhập ID khách hàng: ");
        String idCustomer = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i <customersList.size() ; i++) {
            if (customersList.get(i).getIdCustomer().equals(idCustomer) ){
                flag = false;
                break;
            }
        }
        if (!flag){
            System.out.println("Đã có khách hàng này");
        }else {
            System.out.println("Nhập tên khách hàng: ");
            String name = Regex.inputMyName();
            System.out.println("Nhập tuổi khách hàng: ");
//            String dateOfBirth = null;
//            try{
//                dateOfBirth = RegexData.regexAge(scanner.nextLine(),REGEX_DATE);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            String dateOfBirth = RegexData.regexAge(scanner.nextLine(),Regex.REGEX_DATE);

            System.out.println("Nhập giới tính: 1:Nam   2:Nữ ");
            int choice = Integer.parseInt(scanner.nextLine());
            String gender;
            if (choice == 1) {
                gender = "Nam";
            } else {
                gender = "Nữ";
            }
            System.out.println("Nhập chứng minh nhân dân khách hàng: ");
            int idCard = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập số điện thoại khách hàng: ");
            String phoneNumber =Regex.inputPhone();

            System.out.println("Nhập email khách hàng: ");
            String email = scanner.nextLine();
            System.out.println("Nhập loại khách hàng: 1:Diamond   2:Platinium" +
                    " 3:Gold   4:Silver   5:Member ");
            int choice2 = Integer.parseInt(scanner.nextLine());
            String typeOfCustomer = "";
            switch (choice2) {
                case 1:
                    typeOfCustomer = "Diamond";
                    break;
                case 2:
                    typeOfCustomer = "Platinium";
                    break;
                case 3:
                    typeOfCustomer = "Gold";
                    break;
                case 4:
                    typeOfCustomer = "Silver";
                    break;
                case 5:
                    typeOfCustomer = "Member";
                    break;
            }
            System.out.println("Nhập địa chỉ khách hàng: ");
            String address = scanner.nextLine();
            Customer customer = new Customer(name, dateOfBirth, gender, idCard, phoneNumber,
                    email, idCustomer, typeOfCustomer, address);
            customersList.add(customer);
            String line = "";
            for (Customer item : customersList) {
                line += item.getName() +","+item.getDateOfBirth()+","+item.getGender()+","+item.getIdCard()+","+
                        item.getPhoneNumber()+","+item.getEmail()+","+item.getIdCustomer()+","+item.getTypeOfCustomer()
                        +","+item.getAddress() +"\n";
            }
            ReadAndWrite.writeFile("src\\data\\customer.csv",line);
            System.out.println("Thêm khách hàng thành công !!!");
            display();
        }
    }

    @Override
    public void edit() {
        List<String[]> strList = ReadAndWrite.readFile("src\\data\\customer.csv");
        customersList.clear();
        for ( String[] item: strList){
            Customer customer = new Customer(item[0],item[1],item[2],Integer.parseInt(item[3]),
                   (item[4]),item[5], item[6],item[7],item[8]);
            customersList.add(customer);
        }
        for ( Customer customer: customersList){
            System.out.println(customer);
        }
        System.out.println("Nhập ID khách hàng: ");
        String id = scanner.nextLine();

        for (int i = 0; i <customersList.size() ; i++) {
            if (customersList.get(i).getIdCustomer().equals(id)){
                System.out.println("Có khách hàng với ID này");
//                customersList.remove(i);
                System.out.println("Nhập tên khách hàng: ");
                String name = Regex.inputMyName();
                System.out.println("Nhập tuổi khách hàng: ");
                String dateOfBirth = RegexData.regexAge(scanner.nextLine(),Regex.REGEX_DATE);
                System.out.println("Nhập giới tính: 1:Nam   2:Nữ ");
                int choice = Integer.parseInt(scanner.nextLine());
                String gender;
                if (choice == 1) {
                    gender = "Nam";
                } else {
                    gender = "Nữ";
                }
                System.out.println("Nhập chứng minh nhân dân khách hàng: ");
                int idCard = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập số điện thoại khách hàng: ");
                String phoneNumber = Regex.inputPhone();

                System.out.println("Nhập email khách hàng: ");
                String email = scanner.nextLine();
                System.out.println("Nhập loại khách hàng: 1:Diamond   2:Platinium" +
                        " 3:Gold   4:Silver   5:Member ");
                int choice2 = Integer.parseInt(scanner.nextLine());
                String typeOfCustomer = "";
                switch (choice2) {
                    case 1:
                        typeOfCustomer = "Diamond";
                        break;
                    case 2:
                        typeOfCustomer = "Platinium";
                        break;
                    case 3:
                        typeOfCustomer = "Gold";
                        break;
                    case 4:
                        typeOfCustomer = "Silver";
                        break;
                    case 5:
                        typeOfCustomer = "Member";
                        break;
                }
                System.out.println("Nhập địa chỉ khách hàng: ");
                String address = scanner.nextLine();
                Customer customer = new Customer(name, dateOfBirth, gender, idCard, phoneNumber,
                        email, id, typeOfCustomer, address);
                customersList.set(i,customer);
                String line = "";
                for (Customer item: customersList){
                    line += item.getName() +","+item.getDateOfBirth()+","+item.getGender()+","+item.getIdCard()+","+
                            item.getPhoneNumber()+","+item.getEmail()+","+item.getIdCustomer()+","+item.getTypeOfCustomer()
                            +","+item.getAddress() +"\n";
                }
                ReadAndWrite.writeFile("src\\data\\customer.csv",line);

                System.out.println("Cập nhật thông tin khách hàng thành công !!!");
                break;
            }else {
                System.out.println("Không có khách hàng này!!");
            }
        }
    }

    @Override
    public void delete() {

    }
}
