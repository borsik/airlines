package aviasales.domain;

import java.time.LocalDateTime;

/**
 * Created by laptop on 21.07.2016.
 */
public class Flight {

    private String flight_num;
    private String dep_airport;
    private String arr_airport;
    private LocalDateTime dep_date;
    private LocalDateTime arr_date;
    private int cost;
    private int places_num;

    public Flight(String flight_num, String dep_airport, String arr_airport, LocalDateTime dep_date, LocalDateTime arr_date, int cost, int places_num){
        this.setFlight_num(flight_num);
        this.setDep_airport(dep_airport);
        this.setArr_airport(arr_airport);
        this.setDep_date(dep_date);
        this.setArr_date(arr_date);
        this.setCost(cost);
        this.setPlaces_num(places_num);
    }

    public String getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(String flight_num) {
        this.flight_num = flight_num;
    }

    public String getDep_airport() {
        return dep_airport;
    }

    public void setDep_airport(String dep_airport) {
        this.dep_airport = dep_airport;
    }

    public String getArr_airport() {
        return arr_airport;
    }

    public void setArr_airport(String arr_airport) {
        this.arr_airport = arr_airport;
    }

    public LocalDateTime getDep_date() {
        return dep_date;
    }

    public void setDep_date(LocalDateTime dep_date) {
        this.dep_date = dep_date;
    }

    public LocalDateTime getArr_date() {
        return arr_date;
    }

    public void setArr_date(LocalDateTime arr_date) {
        this.arr_date = arr_date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPlaces_num() {
        return places_num;
    }

    public void setPlaces_num(int places_num) {
        this.places_num = places_num;
    }
}
