package aviasales;

import java.io.Console;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by laptop on 21.07.2016.
 */
public class UserInterface {
    private String cityFrom;
    private String cityTo;
    LocalDate arrivalDate;
    LocalDate departureDate;
    private boolean twoWay;

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
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
        cityFrom = scanner.nextLine();
        System.out.print("Enter city to: ");
        cityTo = scanner.nextLine();
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

        System.out.println("|   TRYING TO FIND SOME... |");

    }

    public LocalDate parseDateFromString(String dateString) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(dateString, formatter);
    }


    public static void main(String [] args) throws ParseException {
        UserInterface userInterface = new UserInterface();
        userInterface.createUserInput();
    }





}
