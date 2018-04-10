import java.util.ArrayList;

import shop.*;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> pepetops = new ArrayList<>();
    ArrayList<String> mexitops = new ArrayList<>();

    pepetops.add("peperoni");
    mexitops.add("beaf");
    mexitops.add("chile");
    mexitops.add("others");

    Regular pPizza = new Regular("big", pepetops);
    Sicilian mPizza = new Sicilian("medium", mexitops);

    System.out.println(pPizza.compareTo(mPizza));

    pPizza.print();
    mPizza.print();

  }
}