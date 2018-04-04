import java.util.Scanner;
import java.io.*;

public class Menu {

  public static void main(String[] args) {
    File menu = new File("./menu.txt");
    File prices = new File("./prices.txt");
    Scanner consoleIn = new Scanner(System.in);
    
    try {
      Scanner fileIn = new Scanner(menu);
      PrintWriter out = new PrintWriter(prices);
      while (fileIn.hasNextLine()) {
        String nextItem = fileIn.nextLine();
        System.out.print("What's the price for " + nextItem + "? \n$");
        nextItem += "\t$" + consoleIn.next();
        out.println(nextItem);
      }
      out.close();
    } catch (Exception e) {
      System.out.println("Oh no! An unexpected error ocurred: ");
      System.out.println(e.toString());
    }

  }

}