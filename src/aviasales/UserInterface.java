package aviasales;

import aviasales.dijkstra.TestDijkstraAlgorithm;

import java.io.Console;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by laptop on 21.07.2016.
 */
public class UserInterface {
    private String departureCity;
    private String arrivalCity;
    LocalDate arrivalDate;
    LocalDate departureDate;
    private boolean twoWay;

    private SearchCriteria searchCriteria;

    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public boolean isTwoWay() {
        return twoWay;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public void setTwoWay(boolean twoWay) {
        this.twoWay = twoWay;
    }

    public void createUserInput() throws ParseException {
        System.out.println("============================");
        System.out.println("|   WELCOME TO AIRLINES    |");
        System.out.println("============================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city from: ");
        departureCity = scanner.nextLine();
        System.out.print("Enter city to: ");
        arrivalCity = scanner.nextLine();
        System.out.print("Enter departure date: ");
        String departureDateStr = scanner.nextLine();
        arrivalDate = parseDateFromString(departureDateStr);

        String arrivalDateStr;

        System.out.print("Two way? (1 - yes, 0 - no): ");

        Scanner scannerInt = new Scanner(System.in);
        int twoWayInt = scannerInt.nextInt();

        if(twoWayInt == 1) {
            System.out.print("Enter arrival date: ");
            arrivalDateStr = scanner.nextLine();
            arrivalDate = parseDateFromString(arrivalDateStr);
            twoWay = true;
        }
        searchCriteria = new SearchCriteria(departureCity, arrivalCity, departureDate, arrivalDate);
        System.out.println("|   TRYING TO FIND SOME... |");

    }

    public LocalDate parseDateFromString(String dateString) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(dateString, formatter);
    }


}
