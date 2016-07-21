package aviasales.da;

import org.junit.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static aviasales.da.Flight.timeFormat;

public class TestFlightDb {

    @Test
    public void testToString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);

        Flight f = new Flight("99A3", "LGW", "DMD", LocalDateTime.parse("12.07.2016 12:15", formatter),
                LocalDateTime.parse("12.07.2016 14:15", formatter), 123.4, 20);
        System.out.println(f.toString());
        assert(f.toString().trim().equals("Flight number: 99A3 Departure airport: LGW Arrive airport: DMD Departure time: 12.07.2016 12:15 Arrive time: 12.07.2016 14:15 Cost: 123.4"));

    }

    @Test
    public void testIsConnectingFlight(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
        Flight f = new Flight("99A3", "LGW", "DMD", LocalDateTime.parse("12.07.2016 12:15", formatter),
                LocalDateTime.parse("12.07.2016 14:15", formatter), 123.4, 20);
        Flight f1 = new Flight("99A3", "DMD", "LGW", LocalDateTime.parse("12.07.2016 12:15", formatter),
                LocalDateTime.parse("13.07.2016 14:15", formatter), 123.4, 20);
        assert(Controller.isConnectingFlight(f, f1));
    }

    @Test
    public void testIsEndFlight()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
        LocalDateTime d = LocalDateTime.parse("25.07.2016 12:00", formatter);
        Flight f = new Flight("99A3", "LGW", "DMD", d, d, 123.4, 20);
        f.toString();
        //SearchCriteria s = new SearchCriteria("LGW", "DMD", d.toLocalDate(), 3);

        System.out.println();
        //assert(Controller.isEndFlight(f, s.getArr()));
    }


}
