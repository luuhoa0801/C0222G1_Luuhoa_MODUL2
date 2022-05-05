package models.facility;

import models.person.Customer;

public class Booking {
    private String idBooking;
    private String startDate;
    private String endDate;
    private String idCustomer;
    private String idFacility;

    public Booking() {
    }

    public Booking(String idBooking, String startDate, String endDate, String idCustomer, String idFacility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.idFacility = idFacility;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    @Override
    public String toString() {
        return "idBooking=" + idBooking +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer=" + idCustomer +
                ", facility=" +  idFacility;

    }
    public String getLineBooking(){
        return idBooking + "," + startDate + "," + endDate + "," + idCustomer + "," + idFacility ;
    }
}
