package aviasales.da;

import aviasales.domain.Flight;

import java.util.Date;
import java.util.List;

/**
 * Created by neg on 7/21/16.
 */
public class FlightConcreteDB implements FlightDb {
    FlightConcreteDB(String sourceFile){

    }
    @Override
    public List<Flight> getFlightsByDate(Date flightDateFrom, Date flightDateTo) {
        final String fileType = ".csv";
        final String delimiter = ",";
        return null;
    }
}
