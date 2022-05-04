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
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customersList = CustomerServiceImpl.getCustomerList();
    static final String FILE_BOOKING= "src\\data\\booking.csv";

    static {


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


        for (Map.Entry<Facility,Integer> item: facilityIntegerMap.entrySet()) {
            if (facilityIntegerMap.containsKey(facility)){         // xet neu co thì tăng value lên 1
                facilityIntegerMap.put(facility,item.getValue()+1);
            }
        }

    }

    @Override
    public void displayBooking() {
        for (Booking booking: bookingSet){
            System.out.println(booking.toString());
        }

    }
    public static Customer chooseCustomer(){
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer: customersList){
            System.out.println(customer.toString());
        }
        boolean check = true;
        System.out.println("Nhập id khách hàng: ");
        String id = scanner.nextLine();
        while (check){
            for (Customer customer:customersList){
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
