package services.impl;

import models.facility.Booking;
import models.facility.Facility;
import models.facility.Villa;
import models.person.Customer;
import services.BookingService;
import utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static {

        customerList.add(new Customer("hòa","10/10/1990","nam",11111,121212,"hoa@gmail",
                "1","haoa","QN"));
        customerList.add(new Customer("hiền","15/10/1990","nữ",133333,22222,"hien@gmail",
                "2","haoa","Dn"));
        customerList.add(new Customer("hảo","20/10/1990","nam",14444,3333,"hao@gmail",
                "3","haoa","SG"));
        //idFacility, String nameService, double areaUse, int expenseRent, int maxNumberPeople,
        //                 String styleRent, String standardVilla, double areaFool, int numberFloor
        Villa villa = new Villa("1","villa1",100,10000,2,"vip",
                "vip",50,3);
        Villa villa1 = new Villa("2","villa2",80,20000,2,"vip",
                "vip",80,2);

        facilityIntegerMap.put(villa,0);
        facilityIntegerMap.put(villa1,0);
    }
    public Set<Booking> sendBooking(){
        return bookingSet;
    }
    @Override
    public void addBooking() {
        String  id = "1";
        if (!bookingSet.isEmpty()){
            id.equals(bookingSet.size());
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê: ");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id,startDate,endDate,customer,facility);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công...");

    }

    @Override
    public void displayBooking() {
        for (Booking booking: bookingSet){
            System.out.println(booking.toString());
        }

    }
    public static Customer chooseCustomer(){
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer: customerList){
            System.out.println(customer.toString());
        }
        boolean check = true;
        System.out.println("Nhập id khách hàng: ");
        String id = scanner.nextLine();
        while (check){
            for (Customer customer:customerList){
                if (customer.getIdCustomer().equals(id)){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai. vui lòng nhập lại id: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }
    public static Facility chooseFacility(){
        System.out.println("Danh sách dịch vụ: ");
        for (Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }
        boolean check = true;
        System.out.println("Nhập id dịch vụ: ");
        String id = scanner.nextLine();
        while (check){
            for (Map.Entry<Facility,Integer>  entry:facilityIntegerMap.entrySet()){
                if (entry.getKey().getIdFacility().equals(id)){
                    check = false;
                    return entry.getKey() ;
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai. vui lòng nhập lại dịch vụ: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
