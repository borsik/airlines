package aviasales;

import aviasales.da.FlightDb;
import aviasales.domain.Flight;
import aviasales.domain.Route;
import aviasales.domain.Ticket;

import java.util.Date;
import java.util.List;

/**
 * Created by laptop on 21.07.2016.
 */
public class SearchEngine {

    public Route findRoute(SearchCriteria searchCriteria) { //searchCriteria для поиска маршрутов
      return null;
    }

    public SearchEngine(FlightDb flightDb) {
       this.flightDb = flightDb;
    }

    private FlightDb flightDb;

    public Ticket findTickets(SearchCriteria searchCriteria) { //searchCriteria для поиска билетов
        return null;
    }

}
