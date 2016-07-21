package aviasales.domain;

/**
 * Created by laptop on 21.07.2016.
 */
public class Airport {

    private String airportName;

    public Airport(String airportName) {
        this.setAirportName(airportName);
    }

    public Airport getAirportByCity(aviasales.domain.City city) {
        return null;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
