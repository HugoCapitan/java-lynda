package cathering;

import java.util.Date;

public class Event {
  private static int eventsNumber = 0;

  private String name;
  private Date date;
  private int guests;
  private int baseCost;
  private int eventNumber;

  public Event(String name) {
    this.name = name; 
    this.date = new Date(); 
    this.guests = 0;
    this.baseCost = 0;
    this.eventNumber = ++eventsNumber;
  }

  public Event(String name, Date date) {
    this.name = name; 
    this.date = date;
    this.guests = 0;
    this.baseCost = 0;
    this.eventNumber = ++eventsNumber;
  }

  public Event(String name, Date date, int guests) {
    this.name = name; 
    this.date = date;
    this.guests = guests;
    this.baseCost = 0;
    this.eventNumber = ++eventsNumber;
  }

  public String getName () { return this.name; }
  public Date getDate() { return this.date; }
  public int getGuests() { return this.guests; }
  public int getBaseCost() { return this.baseCost; }
  public int getEventNumber() { return this.eventNumber; }

  public void setName (String name) { this.name = name; }
  public void setDate (Date date) { this.date = date; }
  public void setGuests (int guests) { this.guests = guests; }
  public void setBaseCost (int baseCost) { this.baseCost = baseCost; }

  public int getEventTotal () {
    return this.guests * this.baseCost;
  }

  public void printEvent () {
    System.out.println(
      "Event Name: " + this.name + ", Event Id: " + this.eventNumber 
      + "\n Date: " + this.date
      + "\n Number of guests: " + this.guests
      + "\n Base cost per guest: $" + this.baseCost
      + "\n Total revenue: $" + this.getEventTotal()
    );
  }
} 