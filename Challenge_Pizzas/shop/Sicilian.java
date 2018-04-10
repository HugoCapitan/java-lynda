package shop;

import java.util.ArrayList;

public class Sicilian extends Pizza {
  public Sicilian(String size, ArrayList<String> topings) {
    super(size, "sicilian", topings);
  }

  @Override
  public void cut(int howMany) {
    System.out.println("Cutting Sicilian pizza in " + howMany + "slices.");
  }
}
