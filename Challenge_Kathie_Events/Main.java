import java.util.Date;

import cathering.*;

public class Main {
  public static void main(String[] args) {
    Event bday = new Event("Johny's Birthday");

    bday.setBaseCost(25);
    bday.setGuests(40);

    Event wedding = new Event("Shayla's Wedding", new Date());

    wedding.setGuests(500);
    wedding.setBaseCost(70);
    
    Event babyShower = new Event("A generic one", new Date(), 89);

    System.out.println("Baby shower guests: " + babyShower.getGuests());

    bday.printEvent();
    wedding.printEvent();
    babyShower.printEvent();
  }
}