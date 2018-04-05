package travelcosts;
import java.util.Scanner;

public class TravelCosts {
  public static void main(String[] args) {
    double distance, milesPerGalon, pricePerGalon, totalCost;
    String vehicleType;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the total distance in miles");
    distance = in.nextDouble();
    System.out.println("Enter the miles per gallon for the vehicle");
    milesPerGalon = in.nextDouble();
    System.out.println("Enter the price of one gallon of gas");
    pricePerGalon = in.nextDouble();
    System.out.println("Please enter the vehicle type");
    vehicleType = in.next();

    totalCost = distance / milesPerGalon * pricePerGalon;
    System.out.printf("The trip is goinf to cost $%5.2f since you are driving a " + vehicleType, totalCost);
    System.out.println("");
  }
}