package controllers;

import services.impl.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static boolean check = true;
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static EmployeeServiceImpl  employeeService = new EmployeeServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static BookingServiceImpl bookingService = new BookingServiceImpl();
    public static  ContractServiceImpl contractService = new ContractServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (check) {
            System.out.println("1.\t Employee Management");
            System.out.println("2.\t Customer Management");
            System.out.println("3.\t Facility Management");
            System.out.println("4.\t Booking Management");
            System.out.println("5.\t Promotion Management");
            System.out.println("6.\t Exit");
            System.out.print("Mời bạn chọn: ");
            switch (scanner.nextLine()) {
                case "1":
                    displayEmployee();
                    break;
                case "2":
                    displayCustomer();
                    break;
                case "3":
                    displayFacility();
                    break;
                case "4":
                    displayBookingMenu();
                    break;
                case "5":
                    displayPromotion();
                    break;
                case "6":
                    System.exit(6);
                    break;
                default:
                    System.out.println("Mời nhập lại: ");
            }
        }
    }

    public static void displayEmployee() {

        while (check) {
            System.out.println("1.\t Display list employees");
            System.out.println("2.\t Add new employee");
            System.out.println("3.\t Edit employee");
            System.out.println("4.\t Return main menu");
            switch (scanner.nextLine()) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.addNew();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    return;
            }
        }
    }

    public static void displayCustomer() {

        while (check) {
            System.out.println("1.\t Display list Customer ");
            System.out.println("2.\t Add new Customer ");
            System.out.println("3.\t Edit Customer ");
            System.out.println("4.\t Delete ");
            System.out.println("5.\t Return main menu");

            switch (scanner.nextLine()) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.addNew();
                    break;
                case "3":
                    customerService.edit();
                    break;
                case "4":
                    customerService.delete();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }

    public static void displayFacility() {

        while (check) {
            System.out.println("1.\t Display list Facility  ");
            System.out.println("2.\t Add new Facility  ");
            System.out.println("3.\t Display list Facility Maintain  ");
            System.out.println("4.\t Return main menu");
            switch (scanner.nextLine()) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    addNewFacilityMainMenu();
                case "3":
                    facilityService.displayMaintenance();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }

    public static void addNewFacilityMainMenu() {
        while (check) {
            System.out.println("1.\t Add New Villa ");
            System.out.println("2.\t Add New House ");
            System.out.println("3.\t Add New Room ");
            System.out.println("4.\t Back to menu  ");
            switch (scanner.nextLine()) {
                case "1":
                    facilityService.addNewVilla();
                    break;
                case "2":
                    facilityService.addNewHouse();
                    break;
                case "3":
                    facilityService.addNewRoom();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Mời nhập lại:");
            }
        }
    }

    public static void displayBookingMenu() {

        while (check) {
            System.out.println("1.\t Add new booking  ");
            System.out.println("2.\tDisplay list booking  ");
            System.out.println("3.\tCreate new constracts  ");
            System.out.println("4.\tDisplay list contracts ");
            System.out.println("5.\tEdit contracts ");
            System.out.println("6.\t Return main menu");
            switch (scanner.nextLine()) {
                case "1":
                    bookingService.addBooking();

                    break;
                case "2":
                    bookingService.displayBooking();

                    break;
                case "3":
                    contractService.createNewContract();
                    break;
                case "4":
                    contractService.displayListContract();
                    break;
                case "6":
                    return;
            }
        }
    }

    public static void displayPromotion() {
        while (check) {
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\t Return main menu");
            switch (scanner.nextLine()) {
                case "1":
            }
        }
    }


}
