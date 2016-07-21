package aviasales.da;

import aviasales.domain.Flight;

import java.util.Date;
import java.util.List;

/**
 * Created by laptop on 21.07.2016.
 */
public interface FlightDb {
    public List<Flight> getFlightsByDate(Date flightDate);




}
