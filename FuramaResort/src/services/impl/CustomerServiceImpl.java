package services.impl;

import models.person.Customer;
import models.person.Employee;
import services.CustomerService;
import utils.RegexData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static final String REGEX_DATE = "((0[13578]|1[02])[\\/.]31[\\/.](18|19|20)[0-9]{2})|((01|0[3-9]|1[1-2])" +
            "[\\/.](29|30)[\\/.](18|19|20)[0-9]{2})|((0[1-9]|1[0-2])[\\/.](0[1-9]|1[0-9]|2[0-8])[\\/.]" +
            "(18|19|20)[0-9]{2})|((02)[\\/.]29[\\/.](((18|19|20)(04|08|[2468][048]|[13579][26]))|2000))";
    static List<Customer> customersList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer: customersList ) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
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
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi khách hàng: ");
            String dateOfBirth = RegexData.regexAge(scanner.nextLine(),REGEX_DATE);
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
            int phoneNumber = Integer.parseInt(scanner.nextLine());
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
            System.out.println("Thêm khách hàng thành công !!!");
            display();
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập ID khách hàng: ");
        String id = scanner.nextLine();

        for (int i = 0; i <customersList.size() ; i++) {
            if (customersList.get(i).getIdCustomer().equals(id)){
                customersList.remove(i);

                System.out.println("Nhập tên khách hàng: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi khách hàng: ");
                String dateOfBirth = RegexData.regexAge(scanner.nextLine(),REGEX_DATE);
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
                int phoneNumber = Integer.parseInt(scanner.nextLine());
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
                customersList.add(customer);
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
