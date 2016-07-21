package aviasales.domain;

import java.util.*;

/**
 * Created by laptop on 21.07.2016.
 */
public class Airport {

    private String airportName;

    public Airport(String airportName) {
        this.setAirportName(airportName);
    }

    public Airport getAirportByCity(City city) {
        Map<City, Airport> city_air_map = new HashMap<>();
        return city_air_map.get(city);
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
