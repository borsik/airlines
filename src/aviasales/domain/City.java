package aviasales.domain;

import java.util.ArrayList;

/**
 * Created by laptop on 21.07.2016.
 */
public class City {

    private String cityName;

    private ArrayList<Airport> airports;

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    public void setAirports(ArrayList<Airport> airports) {
        this.airports = airports;
    }

    public Airport getAirportByName(String airportName) {
        for(int i = 0; i < airports.size(); i++) {
            if(airports.get(i).getAirportName().equals(airportName)) {
                return airports.get(i);
            }
        }
        return null;
    }

    public City(String cityName) {
        this.setCityName(cityName);
    }

    public City getCityByName(String cityName) {
        return new City(cityName);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
