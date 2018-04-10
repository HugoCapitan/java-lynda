package shop;

import java.util.ArrayList;

public class Regular extends Pizza {
  public Regular(String size, ArrayList<String> topings) {
    super(size, "regular", topings);
  }

  @Override
  public void cut(int howMany) {
    System.out.println("Cutting Regular pizza in " + howMany + "slices.");
  }
}

