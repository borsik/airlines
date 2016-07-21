package aviasales.da;

/**
 * Created by laptop on 21.07.2016.
 */
public class Route {

    private aviasales.domain.Airport airport_from;
    private aviasales.domain.Airport airport_to;

    public Route(aviasales.domain.Airport airport_from, aviasales.domain.Airport airport_to){
        this.setAirport_from(airport_from);
        this.setAirport_to(airport_to);
    }

    public String toString(){
        return "Departure airport: " + airport_from + " & Arrival airport: " + airport_to;
    }

    public aviasales.domain.Airport getAirport_from() {
        return airport_from;
    }

    public void setAirport_from(aviasales.domain.Airport airport_from) {
        this.airport_from = airport_from;
    }

    public aviasales.domain.Airport getAirport_to() {
        return airport_to;
    }

    public void setAirport_to(aviasales.domain.Airport airport_to) {
        this.airport_to = airport_to;
    }
}
