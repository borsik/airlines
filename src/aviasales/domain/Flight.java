package aviasales.domain;

/**
 * Created by laptop on 21.07.2016.
 */
public class Flight {

    private String flight_num;
    private String dep_airport, arr_airport;
    private Date dep_date, arr_date;
    private int cost;
    private int places_num;

    public Flight(String flight_num, String dep_airport, String arr_airport, Date dep_date, Date arr_date, int cost, int places_num){
        this.flight_num = flight_num;
        this.dep_airport = dep_airport;
        this.arr_airport = arr_airport;
        this.dep_date = dep_date;
        this.arr_date = arr_date;
        this.cost = cost;
        this.places_num = places_num;
    }

}
