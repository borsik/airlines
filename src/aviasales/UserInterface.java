package aviasales;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by laptop on 21.07.2016.
 */
public class UserInterface {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Airline");
        System.out.print("Enter city from: ");
        String cityFrom = scanner.nextLine();
        System.out.print("Enter city to: ");
        String cityTo = scanner.nextLine();
        System.out.print("Enter date from: ");
        String dateFrom = scanner.nextLine();
        System.out.print("Enter date to: ");
        String dateTo = scanner.nextLine();




    }
}
