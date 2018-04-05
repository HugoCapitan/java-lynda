import java.util.List;
import java.util.Random;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * MonteCarlo
 */
public class MonteCarlo {

  public static void main(String[] args) {
    picker(10000);
    picker(100000);
    picker(1000000);
    picker(10000000);
    picker(100000000);
    picker(1000000000);
  }

  public static void picker(int tries) {
    int success = 0;
    Random generator = new Random();    
    
    for (int i = 0; i < tries; i++) {
      List<String> bowl = new ArrayList<>();
      List<String> hand = new ArrayList<>();

      // Bowl setup
      for (int k = 0; k < 6; k++) {
        if (k < 3) {
          bowl.add("green");
        } else 
          bowl.add("blue");
      }

      int j = 6;
      while (true) {
        if (j < 4) break;

        int position = generator.nextInt(j);
        String selected = bowl.remove(position);
        hand.add(selected);
        --j;
      }

      for(int h = 0; h < 3; h++) {
        if (!hand.get(h).equals("green")) break;
        else if(h == 2) ++success;
      }
    }

    String triesSt = String.valueOf(tries);
    String successSt = String.valueOf(success);

    BigDecimal triesB = new BigDecimal(triesSt);
    BigDecimal successB = new BigDecimal(successSt);
    BigDecimal hundred = new BigDecimal("100");
    
    BigDecimal result = hundred.divide(triesB).multiply(successB);

    System.out.println("The probability is: " + result + "%");
  }
}