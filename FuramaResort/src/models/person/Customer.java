package models.person;

public class Customer extends Person {
    private String idCustomer;
    private String typeOfCustomer;
    private String address;

//    public Customer() {
//    }
//
//    public Customer(int idCustomer, String typeOfCustomer, String address) {
//        this.idCustomer = idCustomer;
//        this.typeOfCustomer = typeOfCustomer;
//        this.address = address;
//    }

    public Customer(String name, String dateOfBirth, String gender, int idCard, int phoneNumber,
                    String email, String idCustomer, String typeOfCustomer, String address) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", idCustomer=" + idCustomer +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
