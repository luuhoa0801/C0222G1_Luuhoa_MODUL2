package models.facility;

import java.util.Objects;

public abstract class Facility {
    private String idFacility;
    private String nameService;
    private int areaUse;
    private int expenseRent;
    private int maxNumberPeople;
    private String styleRent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(idFacility, facility.idFacility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFacility);
    }

    public Facility() {
    }

    public Facility(String idFacility, String nameService, int areaUse, int expenseRent,
                    int maxNumberPeople, String styleRent) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.expenseRent = expenseRent;
        this.maxNumberPeople = maxNumberPeople;
        this.styleRent = styleRent;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(int areaUse) {
        this.areaUse = areaUse;
    }

    public int getExpenseRent() {
        return expenseRent;
    }

    public void setExpenseRent(int expenseRent) {
        this.expenseRent = expenseRent;
    }

    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    public String getStyleRent() {
        return styleRent;
    }

    public void setStyleRent(String styleRent) {
        this.styleRent = styleRent;
    }

    @Override
    public String toString() {
        return
                "idFacility=" + idFacility +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", expenseRent=" + expenseRent +
                ", maxNumberPeople=" + maxNumberPeople +
                ", styleRent='" + styleRent + '\'' +
                '}';
    }
}
