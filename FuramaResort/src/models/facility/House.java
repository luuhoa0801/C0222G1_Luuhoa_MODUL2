package models.facility;

import models.facility.Facility;

public class House  extends Facility {
    private String standardHouse;
    private int numberFloor;

    public House(String standardHouse, int numberFloor) {
        this.standardHouse = standardHouse;
        this.numberFloor = numberFloor;
    }

    public House(String idFacility, String nameService, int areaUse, int expenseRent,
                 int maxNumberPeople, String styleRent, String standardHouse, int numberFloor) {
        super(idFacility, nameService, areaUse, expenseRent, maxNumberPeople, styleRent);
        this.standardHouse = standardHouse;
        this.numberFloor = numberFloor;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                "standardHouse='" + standardHouse + '\'' +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
