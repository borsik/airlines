package aviasales.domain;

import java.time.LocalDate;

/**
 * Created by laptop on 21.07.2016.
 */
public class Ticket {
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private City arrivalCity;
    private City departureCity;
    private Passenger passenger;

    public City getArrivalCity() {
        return arrivalCity;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Ticket(LocalDate arrivalDate, LocalDate departureDate, City arrivalCity, City departureCity, Passenger passenger){
        this.arrivalCity = arrivalCity;
        this.departureCity = departureCity;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.passenger = passenger;
    }

}
