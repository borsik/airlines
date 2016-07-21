package aviasales.da;

import aviasales.domain.Airport;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flight implements BuffAdapter {
    public static final String fileType = ".csv";
    public static final String delimiter = ",";
    public static final String timeFormat = "dd.MM.yyyy-HH:mm";

    private String number;
    private double cost;
    private int freePlaces;
    private Airport fromDer;
    private Airport toDer;
    private LocalDateTime fromTime;
    private LocalDateTime arrTime;

    public Flight(String number, Airport fromDer, Airport arr, LocalDateTime fromTime,
                  LocalDateTime arrTime, double cost, int freePlaces){
        this.number = number;
        this.fromDer = fromDer;
        this.toDer = arr;
        this.fromTime = fromTime;
        this.arrTime = arrTime;
        this.cost = cost;
        this.freePlaces = freePlaces;
    }

    public String getNumber(){ return number; }
    public double getCost(){ return cost; }
    public int freePlaces(){ return freePlaces; }
    public Airport getFromDer(){ return fromDer; }
    public Airport getToDer(){ return toDer; }
    public LocalDateTime getFromTime(){ return fromTime; }
    public LocalDateTime getArrTime(){ return arrTime; }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
        return  " Departure airport: " + fromDer +
                " Arrive airport: " + toDer +
                " Departure time: " + fromTime.format(formatter) +
                " Arrive time: " + arrTime.format(formatter) +
                " Cost: " + cost;
    }

    @Override
    public String BufStr() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
        return getNumber() + delimiter
                + getFromDer() + delimiter
                + getToDer() + delimiter
                + getFromTime().format(formatter) + delimiter
                + getArrTime().format(formatter)  + delimiter
                + getCost() +  delimiter
                + freePlaces();
    }
}
