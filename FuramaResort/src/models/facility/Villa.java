package models.facility;

import models.facility.Facility;

public class Villa extends Facility {
    private String standardVilla;
    private int areaPool;
    private int numberFloor;

//    public Villa() {
//    }
//
//    public Villa(String standardVilla, double areaFool, int numberFloor) {
//        this.standardVilla = standardVilla;
//        this.areaFool = areaFool;
//        this.numberFloor = numberFloor;
//    }

    public Villa(String idFacility, String nameService, int areaUse, int expenseRent, int maxNumberPeople,
                 String styleRent, String standardVilla, int areaPool, int numberFloor) {
        super(idFacility, nameService, areaUse, expenseRent, maxNumberPeople, styleRent);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }


    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public int getAreaFool() {
        return areaPool;
    }

    public void setAreaFool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return ", Villa{" +super.toString() +
                "standardVilla='" + standardVilla + '\'' +
                ", areaFool=" + areaPool +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
