package aviasales.domain;

import java.time.LocalDate;

/**
 * Created by laptop on 21.07.2016.
 */
public class Ticket {
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private Route route;
    private Passenger passenger;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
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

    public Ticket(LocalDate arrivalDate, LocalDate departureDate, Route route, Passenger passenger){
        this.route = route;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.passenger = passenger;
    }

}
