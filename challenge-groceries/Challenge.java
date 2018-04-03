import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {

  public static void main(String[] args) {
    String query;
    ArrayList<String> groceries = new ArrayList<String>();
    groceries.add("Bananas");
    groceries.add("Soap");
    groceries.add("PopTarts");
    groceries.add("Cereal");
    groceries.add("Salt");
    groceries.add("Shampoo");
    groceries.add("Meat");
    groceries.add("Coffee");
    groceries.add("Bread");
    groceries.add("Salties");
    groceries.add("Apples");
    groceries.add("Wine");

    sort(groceries);

    System.out.println(groceries);

    // System.out.println("What do you want to search for?");
    // query = in.next();

    // search(groceries, search)
  }

  public static void sort(ArrayList<String> groceries) {
    int smaller, i, j;
    String temp;

    for (i = 0; i < groceries.size(); i++) {
      smaller = i;
      for (j = groceries.size() - 1; j > i; j--) {
        if ( isMinor(groceries.get(j), groceries.get(smaller)) )
          smaller = j;
      }
      temp = groceries.get(smaller);
      groceries.set(smaller, groceries.get(i));
      groceries.set(i, temp);
    }
  }

  public void search(ArrayList<String> groceries, String query) {
    
  }

  public static boolean isMinor(String firstWord, String secondWord) {
    boolean isMinor = false;
    boolean again = false;
    int i = 0;

    do {
      again = false;
      if (i == firstWord.length() - 1) {
        isMinor = true;
        break;
      } else if (i == secondWord.length() - 1) {
        isMinor = false;
        break;
      }

      char fc = firstWord.charAt(i);
      char sc = secondWord.charAt(i);
      Character.toLowerCase(fc);
      Character.toLowerCase(sc);

      if (fc == sc)
        again = true;
      else if (fc < sc)
        isMinor = true;
      else if (fc > sc)
        isMinor = false;
      
      i++;
    } while (again);

    return isMinor;
  }
}