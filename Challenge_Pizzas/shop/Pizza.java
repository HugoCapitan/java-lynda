package shop;

import java.util.ArrayList;

public abstract class Pizza implements Comparable{
  private String size;
  private String type; 
  private ArrayList<String> topings;
  private int cost;

  public Pizza (String size, String type, ArrayList<String> topings) {
    this.size = size;
    this.type = type;
    this.topings = topings;

    switch (this.size) {
      case "small":
        this.cost = 3;
        break;
      case "medium":
        this.cost = 5;
        break;
      case "big":
        this.cost = 6;
        break;
      default:
        this.cost = 5;
    }
  }

  public String getSize() { return this.size; }
  public String getType() { return this.type; }
  public ArrayList<String> getTopings() { return this.topings; }
  public int getCost() { return this.cost; }

  public void setSize(String size) { this.size = size; }
  public void setType(String type) { this.type = type; }
  public void setTopings(ArrayList<String> topings) { this.topings = topings; }
  public void setCost(int cost) { this.cost = cost; }
  
  public int compareTo(Object a) {
    Pizza pa = (Pizza) a;
    
    int paSize = getSizeNumber(pa.getSize());
    int thisSize = getSizeNumber(this.size);

    if (paSize < thisSize) 
      return 1;
    else if (paSize > thisSize)
      return -1;
    else
      return 0;
  }

  private static int getSizeNumber(String size) {
    switch (size) {
      case "small":
        return 1;
      case "medium":
        return 2;
      case "big":
        return 3;
      default:
        return -1;
    }
  }

  public void print () {
    System.out.println(
      "Hey!"
      + "\n This " + this.size + " size pizza is "
      + "\n" + this.type 
      + "\n has " + this.topings.size() + "topings"
      + "\n and costs $" + this.cost
    );
  }

  public abstract void cut(int howMany);

}