package models.facility;

import models.person.Customer;

public class Contract {
    private String idContract;
    private Booking booking;
    private int moneyDeposit;
    private int totalFee;
    private Customer customer;

    public Contract() {
    }
    public Contract(String idContract, Booking booking, int moneyDeposit, int totalFee, Customer customer) {
        this.idContract = idContract;
        this.booking = booking;
        this.moneyDeposit = moneyDeposit;
        this.totalFee = totalFee;
        this.customer = customer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(int moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", booking=" + booking +
                ", moneyDeposit=" + moneyDeposit +
                ", totalFee=" + totalFee +
                ", customer=" + customer +
                '}';
    }
}
