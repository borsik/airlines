package aviasales;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by laptop on 21.07.2016.
 */

public class SearchCriteria {
    String dept;
    String arv;
    Date dateDept;
    Date dateArv;
    private LocalDate depDate;

    public SearchCriteria(String newDept, String newArv, Date newDateDept, Date newDateArv){
        dept = newDept;
        arv = newArv;
        dateDept = newDateDept;
        dateArv = newDateArv;

    private String departureCity;
    private String arrivalCity;
    private LocalDate dateDeparture;
    private LocalDate dateArrival;

    public LocalDate getDateArrival() {
        return dateArrival;
    }

    public LocalDate getDateDeparture() {
        return dateDeparture;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setDateArrival(LocalDate dateArrival) {
        this.dateArrival = dateArrival;
    }

    public void setDateDeparture(LocalDate dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public SearchCriteria(String newDept, String newArv, LocalDate newDateDept, LocalDate newDateArv){
        this.departureCity = newDept;
        this.arrivalCity = newArv;
        this.dateDeparture = newDateDept;
        this.dateArrival = newDateArv;
    }

    public String getDep() {
    }

    public String getArr() {
        return arr;
    }

    public LocalDate getDepDate() {
        return depDate;
    }

    public int getClinetsCount() {
        return clinetsCount;
    }
}
