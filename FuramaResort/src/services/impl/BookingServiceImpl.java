package services.impl;

import controllers.FuramaController;
import models.facility.Booking;
import models.facility.Facility;
import models.facility.Villa;
import models.person.Customer;
import services.BookingService;
import utils.BookingComparator;
import utils.ReadAndWrite;


import java.io.File;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static Map<Facility,Integer> facilityIntegerMap = FuramaController.facilityService.getFacilityIntegerMap();
    static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customersList = CustomerServiceImpl.getCustomerList();
    static final String FILE_BOOKING= "src\\data\\booking.csv";
    static final String FILE_FACILITY = "src\\data\\facility\\facility.csv";

//    static {
//
//        Villa villa = new Villa("1","villa1",100,10000,2,"vip",
//                "vip",50,3);
//        Villa villa1 = new Villa("2","villa2",80,20000,2,"vip",
//                "vip",80,2);
//
//        facilityIntegerMap.put(villa,0);
//        facilityIntegerMap.put(villa1,0);
//    }
    public Set<Booking> sendBooking(){
        return bookingSet;
    }
    @Override
    public void addBooking() {

        facilityIntegerMap = FuramaController.facilityService.getFacilityIntegerMap();
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

        Booking booking = new Booking(id,startDate,endDate,customer.getIdCustomer(),facility.getIdFacility());
        ReadAndWrite.writeFile(FILE_BOOKING,booking.getLineBooking());
        System.out.println("Đã booking thành công...");

            for ( Map.Entry<Facility,Integer> item: facilityIntegerMap.entrySet()) {
                if (item.getKey().getIdFacility().equals(facility.getIdFacility())){
                    item.setValue(item.getValue() +1);
                }
            }
        File file = new File(FILE_FACILITY);
        file.delete();

        for ( Map.Entry<Facility,Integer> item: facilityIntegerMap.entrySet()) {
            ReadAndWrite.writeFile(FILE_FACILITY,item.getKey().goLineFacility()+","+item.getValue());
        }

    }


    @Override
    public void displayBooking() {
        List<Booking> bookingArrayList = new ArrayList<>();
        List<String[]> strList = ReadAndWrite.readFile(FILE_BOOKING);
        for ( String[] item: strList){
            Booking booking = new Booking(item[0],item[1],item[2],item[3],item[4]);
            bookingArrayList.add(booking);
        }

        for (Booking booking: bookingArrayList){
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer(){
        System.out.println("Danh sách khách hàng: ");

        for (Customer item : customersList){      // hiển thị danh sách khách hàng
            System.out.println(item.toString());
        }
        boolean check;
        String id;

        do{
            check = true;
            System.out.println("Nhập id khách hàng: ");
            id = scanner.nextLine();
            for (Customer item :customersList){
                if (item.getIdCustomer().equals(id)){
                    check = false;
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai. vui lòng nhập lại id");
            } else return FuramaController.customerService.getCustomer(id);
        }while (true);
    }

    public static Facility chooseFacility(){
        System.out.println("Danh sách dịch vụ: ");
        facilityIntegerMap = FuramaController.facilityService.getFacilityIntegerMap();

        for (Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey());
        }

        boolean check;
        String id;

        do {
            check = true;
            System.out.println("Nhập id dịch vụ: ");
             id = scanner.nextLine();
            for (Map.Entry<Facility, Integer> item: facilityIntegerMap.entrySet()) {
                if (item.getKey().getIdFacility().equals(id)){
                    check = false;
                }
            }
            if (check){
                System.out.println("Không có dịch vụ này");
            }else {
                return FuramaController.facilityService.getFacility(id);
            }

        }while (true);

//        while (check){
//            for (Map.Entry<Facility,Integer>  entry:facilityIntegerMap.entrySet()){
//                if (entry.getKey().getIdFacility().equals(id)){
//                    check = false;
//                    return entry.getKey() ;
//                }
//            }
//            if (check){
//                System.out.println("Bạn đã nhập sai. vui lòng nhập lại dịch vụ: ");
//                id = scanner.nextLine();
//            }
//        }
//        return null;
    }

}
