package aviasales.da;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flight implements BuffAdapter {
    private String number;
    private double cost;
    private int freePlaces;
    private String fromDer;
    private String toDer;
    private LocalDateTime fromTime;
    private LocalDateTime arrTime;
    private static String timeFormat = "dd.MM.yyyy-HH:mm";

    public Flight(String number, String fromDer, String arr, LocalDateTime fromTime,
                  LocalDateTime arrTime, double cost, int freePlaces){
        this.number = number;
        this.fromDer = fromDer;
        this.toDer = arr;
        this.fromTime = fromTime;
        this.arrTime = arrTime;
        this.cost = cost;
        this.freePlaces = freePlaces;
    }

    private String getNumber(){ return number; }
    private double getCost(){ return cost; }
    private int freePlaces(){ return freePlaces; }
    private String getFromDer(){ return fromDer; }
    private String getToDer(){ return toDer; }
    private LocalDateTime getFromTime(){ return fromTime; }
    private LocalDateTime getArrTime(){ return arrTime; }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
        String tmp = " Departure airport: " + this.fromDer +
                " Arrive airport: " + this.toDer +
                " Departure time: " + this.fromTime.format(formatter) +
                " Arrive time: " + this.arrTime.format(formatter) +
                " Cost: " + this.cost;
        return tmp;
    }

    @Override
    public String BufStr() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
        return getNumber() + ","
                + getFromDer() + ","
                + getToDer() + ","
                + getFromTime().format(formatter) + ","
                + getArrTime().format(formatter) + ","
                + getCost() + ","
                + freePlaces();
    }
}

