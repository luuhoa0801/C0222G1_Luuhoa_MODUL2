package controllers;

import services.impl.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static  boolean check = true;

    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        while (check){
            System.out.println("1.\t Employee Management");
            System.out.println("2.\t Customer Management");
            System.out.println("3.\t Facility Management");
            System.out.println("4.\t Booking Management");
            System.out.println("5.\t Promotion Management");
            System.out.println("6.\t Exit");
            System.out.print("Mời bạn chọn: ");
            switch (scanner.nextInt()){
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotion();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        }
    }

    public static void displayEmployee(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        while (check){
            System.out.println("1.\t Display list employees");
            System.out.println("2.\t Add new employee");
            System.out.println("3.\t Edit employee");
            System.out.println("4.\t Return main menu");
            switch (scanner.nextInt()){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }
    public static void displayCustomer(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        while (check){
            System.out.println("1.\t Display list Customer ");
            System.out.println("2.\t Add new Customer ");
            System.out.println("3.\t Edit Customer ");
            System.out.println("4.\t Return main menu");
            switch (scanner.nextInt()){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }
    public static void displayFacility(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        while (check){
            System.out.println("1.\t Display list Facility  ");
            System.out.println("2.\t Add new Facility  ");
            System.out.println("3.\t Display list Facility Maintain  ");
            System.out.println("4.\t Return main menu");
            switch (scanner.nextInt()){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMainMenu();
            }
        }
    }
    public static void addNewFacilityMainMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        while (check){
            System.out.println("1.\t Add New Villa ");
            System.out.println("2.\t Add New House ");
            System.out.println("3.\t Add New Room ");
            System.out.println("4.\t Back to menu  ");
            switch (scanner.nextInt()){
                case 1:
                    facilityService.addNewVilla();
                    displayFacility();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    displayFacility();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    displayFacility();
                    break;
                case 4:
                    displayFacility();
                    break;
            }
        }
    }
    public static void displayBookingMenu(){
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        while (check){
            System.out.println("1.\t Add new booking  ");
            System.out.println("2.\tDisplay list booking  ");
            System.out.println("3.\tCreate new constracts  ");
            System.out.println("4.\tDisplay list contracts ");
            System.out.println("5.\tEdit contracts ");
            System.out.println("6.\t Return main menu");
            switch (scanner.nextInt()){
                case 1:
                    bookingService.addBooking();
                    displayBookingMenu();
                    break;
                case 2:
                    bookingService.displayBooking();
                    displayBookingMenu();
                    break;
                case 3:
                    contractService.createNewContract();
                    break;
                case 4:
                    contractService.displayListContract();
                    break;

            }
        }
    }
    public static void displayPromotion(){
        while (check){
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\t Return main menu");
            switch (scanner.nextInt()){
                case 1:
            }
        }
    }



}
