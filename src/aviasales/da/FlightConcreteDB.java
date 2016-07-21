package aviasales.da;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import static aviasales.da.Flight.delimiter;
import static aviasales.da.Flight.fileType;
import static aviasales.da.Flight.timeFormat;

public class FlightConcreteDB implements FlightDb {

    FlightConcreteDB(String sourceFile) throws IOException {
        loadFlights(sourceFile);
    }

    static void printOK() {
        System.out.println("Well done");
    }

    static ArrayList<BuffAdapter> loadObjects(String className) throws IOException {
        ArrayList<BuffAdapter> objects = new ArrayList<>();
        try (BufferedReader ignored = new BufferedReader(new FileReader(className + fileType))) {
            return objects;
        } finally {
            printOK();
        }
    }

    private static String getNextElem(StringTokenizer st) {
        return st.nextElement().toString();
    }

    @Override
    public List<Flight> filterFlightsByDate(Date flightDateFrom, Date flightDateTo) {
        return null;
    }

    public ArrayList<Flight> loadFlights(String file) throws IOException {
        ArrayList<Flight> flights = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file + fileType))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line).append("\n");


                StringTokenizer st = new StringTokenizer(line, delimiter);
                while (st.hasMoreTokens()) {
                    int placeNumber;
                    double cost;
                    String number, fromDir, toDir;
                    LocalDateTime fromTime, toTime;

                    number = getNextElem(st);
                    fromDir = getNextElem(st);
                    toDir = getNextElem(st);

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
                    fromTime = LocalDateTime.parse(st.nextElement().toString(), formatter);
                    if (fromTime.isBefore(LocalDateTime.now()))
                        continue;
                    toTime = LocalDateTime.parse(st.nextElement().toString(), formatter);
                    cost = Double.valueOf(st.nextElement().toString());
                    placeNumber = Integer.parseInt(st.nextElement().toString());

                    //Flight cf = new Flight(number, fromDir, toDir, fromTime, toTime, cost, placeNumber);
                    //flights.add(cf);
                    //System.out.println(cf.toString());
                }
                line = br.readLine();
            }
            return flights;

        } finally {
            // TODO if debug
            printOK();
        }

    }

    static int save(ArrayList<BuffAdapter> objects) throws IOException {
        BufferedWriter bw;
        if (objects.isEmpty()) {
            return 0;
        }
        try {

            bw = new BufferedWriter( new FileWriter(objects.get(0).Name() + fileType) );

            System.out.println(objects.get(0).Name() + fileType);

            for (BuffAdapter tf : objects) {
                bw.write(tf.BufStr() + "\n");
                System.out.println(tf.BufStr());
            }
            bw.flush(); bw.close();

            return 1;

        } catch (Exception e) {
            return -1;
        }
    }

    public List<Flight> getFlightsByDate(Date flightDateFrom, Date flightDateTo) {
        final String fileType = ".csv";
        final String delimiter = ",";
        return null;
    }

    interface BuffAdapter {
        String Name();
        String BufStr();
    }
}
