import java.awt.SystemTray;
import java.util.Scanner;

public class ChargesCalculator {

  public static void main(String[] args) {
    String keepCalculating;
    Scanner in = new Scanner(System.in);

    do {
      String isOvernight;
      double total = 0.0;

      System.out.println("Is the patient staying overnight? (y/n)");
      isOvernight = in.next();

      if (isOvernight.equals("y")) {
        System.out.println("What's the charge for an overnight stay in dollars?");
        total += in.nextDouble();
      }

      System.out.println("What's the medication charge?");
      total += in.nextDouble();
      System.out.println("What's the laboratory services charge?");
      total += in.nextDouble();

      System.out.printf("The total for your stay is $%5.2f", total);
      System.out.println("");

      System.out.println("Calculate for another patient? (y/n)");
      keepCalculating = in.next();
      
    } while (keepCalculating.equals("y"));
  }

}