package models.facility;

import models.facility.Facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String idFacility, String nameService, int areaUse, int expenseRent,
                int maxNumberPeople, String styleRent, String freeServiceIncluded) {
        super(idFacility, nameService, areaUse, expenseRent, maxNumberPeople, styleRent);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}'+'\'';
    }
}
