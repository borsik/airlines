package aviasales.domain;

/**
 * Created by laptop on 21.07.2016.
 */
public class City {

    private String cityName;

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
