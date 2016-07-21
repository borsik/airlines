package aviasales.da;

/**
 * Created by neg on 7/21/16.
 */

import aviasales.SearchCriteria;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Controller {

    private static ArrayList<Route> result = new ArrayList<>();

    public static ArrayList<Route> searchdirectFlights(SearchCriteria sp) throws IOException {
        //ArrayList<Flight> flights = FlightConcreteDB.loadFlights();

        String from = sp.getDepartureCity();
        String to = sp.getArrivalCity();
        LocalDate depDate = sp.getDateDeparture();

        Flight flights;
        for (Flight f : flights) {
            if ((f.getFromTime().toLocalDate().isEqual(depDate)
                    && (f.freePlaces() >= sp.getClientsCount())))
                if ((Objects.equals(f.getFromDer(), from))) {

                    if (isEndFlight(f, to)) {
                        Controller.result.add(new Route(f));

                    } else {
                        searchConnectedFlights(f, to, sp.getClientsCount());
                    }
                }
        }
        return result;

    }

    private static void searchConnectedFlights(Flight f, String to, int clinetsCount) {
    }

    // private static void searchConnectedFlights(Flight flight, String arr, int personCount) throws IOException {
    //     ArrayList<Flight> flights = FileWidget.loadFlights();

    //     for (Flight f : flights) {
    //         if ((isConnectingFlight(flight,f)) && (f.freePlaces() >= personCount)) {
    //             if (isEndFlight(f,arr)) {
    //                 Route route = new Route(flight);
    //                 route.flights.add(f);
    //                 Controller.result.add(route);
    //             }
    //         }
    //     }
    // }

    public static boolean isConnectingFlight(Flight f1, Flight f2) {
        LocalDateTime min, max;
        min = f1.getArrTime().plusHours(1);
        max = f1.getArrTime().plusHours(9);
        return (Objects.equals(f1.getToDer(), f2.getFromDer()))
                && (f2.getFromTime().isAfter(min)) && (f2.getFromTime().isBefore(max));
    }

    public static boolean isEndFlight(Flight f, String arr) {
        return Objects.equals(f.getToDer(), arr);
    }

}
