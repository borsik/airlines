package aviasales;

import java.io.Console;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by laptop on 21.07.2016.
 */
public class UserInterface {
    private String cityFrom;
    private String cityTo;
    Date arrivalDate;
    Date departureDate;
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



    public void createUserInput() {
        System.out.println("============================");
        System.out.println("|   WELCOME TO AIRLINES    |");
        System.out.println("============================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Airline");
        System.out.print("Enter city from: ");
        cityFrom = scanner.nextLine();
        System.out.print("Enter city to: ");
        cityTo = scanner.nextLine();
        System.out.print("Enter departure date: ");
        String departureDateStr = scanner.nextLine();
        String arrivalDateStr;

        System.out.print("Two way? (1 - yes, 0 - no): ");
        int twoWay = scanner.nextInt();
        if(twoWay == 1) {
            System.out.print("Enter arrival date: ");
            arrivalDateStr = scanner.nextLine();
        }


    }


}
