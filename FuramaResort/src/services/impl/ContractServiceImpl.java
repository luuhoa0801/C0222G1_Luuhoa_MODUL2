package services.impl;

import models.facility.Booking;
import models.facility.Contract;
import models.person.Customer;
import services.ContractService;

import java.util.*;

public class ContractServiceImpl  implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Đang tạo hợp đồng cho Booking có thông tin: " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer.toString());
            System.out.println("Nhập id hợp đồng");
            String id = scanner.nextLine();
            System.out.println("Nhập số tiền trả trước: ");
            int moneyDeposit = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tổng chi phí: ");
            int totalFee = Integer.parseInt(scanner.nextLine());
            Contract contract = new Contract(id, booking, moneyDeposit, totalFee, customer);
            contractList.add(contract);
            System.out.println("Đã tạp hợp đồng thành công!!!" + contract.toString());
        }
    }
    @Override
    public void displayListContract() {
    for (Contract contract: contractList){
        System.out.println(contract.toString());
    }
    }

    @Override
    public void editContract() {

    }
}
