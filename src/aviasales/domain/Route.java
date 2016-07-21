package aviasales.domain;

/**
 * Created by laptop on 21.07.2016.
 */
public class Route {

    private Airport airport_from;
    private Airport airport_to;

    public Route(Airport airport_from, Airport airport_to){
        this.setAirport_from(airport_from);
        this.setAirport_to(airport_to);
    }

    public Airport getAirport_from() {
        return airport_from;
    }

    public void setAirport_from(Airport airport_from) {
        this.airport_from = airport_from;
    }

    public Airport getAirport_to() {
        return airport_to;
    }

    public void setAirport_to(Airport airport_to) {
        this.airport_to = airport_to;
    }
}
