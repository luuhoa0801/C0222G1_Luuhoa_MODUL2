package services.impl;

import models.person.Customer;
import models.person.Employee;
import services.CustomerService;
import utils.ReadAndWrite;
import utils.Regex;
import utils.RegexData;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static final String FILE_CUSTOMER= "src\\data\\customer.csv";

    public static List<Customer> customersList = getCustomerList();
    Scanner scanner = new Scanner(System.in);

    public static List<Customer> getCustomerList(){
        List<Customer> customersList = new LinkedList<>();
        List<String[]> strList = ReadAndWrite.readFile(FILE_CUSTOMER);
        for ( String[] item: strList){
            Customer customer = new Customer(item[0],item[1],item[2],Integer.parseInt(item[3]),
                    (item[4]),item[5], item[6],item[7],item[8]);
            customersList.add(customer);
        }
        return customersList;
    }


    @Override
    public void display() {
        customersList = getCustomerList();

        for (Customer customer: customersList ) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        customersList = getCustomerList();

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
            String name = Regex.inputName();
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

            ReadAndWrite.writeFile(FILE_CUSTOMER,customer.getLine());
            System.out.println("Thêm khách hàng thành công !!!");
            display();
        }
    }

    @Override
    public void edit() {
        customersList = getCustomerList();

        display();

        System.out.println("Nhập ID khách hàng: ");
        String id = scanner.nextLine();

        int index = 0;
        boolean check = false;
        for (int i = 0; i <customersList.size() ; i++) {
            if (customersList.get(i).getIdCustomer().equals(id)){
                index = i;
                check = true;
                break;
            }
        }

        if (check){
            System.out.println("Có khách hàng với ID này");

            System.out.println("Nhập tên khách hàng: ");
            String name = Regex.inputName();
            customersList.get(index).setName(name);

            System.out.println("Nhập tuổi khách hàng: ");
            String dateOfBirth = RegexData.regexAge(scanner.nextLine(),Regex.REGEX_DATE);
            customersList.get(index).setAge(dateOfBirth);

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
            customersList.get(index).setIdCard(idCard);

            System.out.println("Nhập số điện thoại khách hàng: ");
            String phoneNumber = Regex.inputPhone();
            customersList.get(index).setPhoneNumber(phoneNumber);

            System.out.println("Nhập email khách hàng: ");
            String email = scanner.nextLine();
            customersList.get(index).setEmail(email);

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
            customersList.get(index).setAddress(address);

            File file = new File(FILE_CUSTOMER);
            file.delete();

            for (Customer item: customersList) {
                ReadAndWrite.writeFile(FILE_CUSTOMER,item.getLine());
            }
        }else {
            System.out.println("Không có khách hàng với id này");
        }
    }

    @Override
    public void delete() {
        customersList = getCustomerList();

        display();

        System.out.println("Nhập ID khách hàng: ");
        String id = scanner.nextLine();

        int index = 0;
        boolean check = false;
        for (int i = 0; i <customersList.size() ; i++) {
            if (customersList.get(i).getIdCustomer().equals(id)){
                index = i;
                check = true;
                break;
            }
        }

        if (check){
            customersList.remove(index);
            System.out.println("Xóa thành công");
            File file = new File(FILE_CUSTOMER);
            file.delete();

            for (Customer item: customersList) {
                ReadAndWrite.writeFile(FILE_CUSTOMER,item.getLine());
            }
        }else {
            System.out.println("Không có khách hàng với id này");
        }

    }
}
