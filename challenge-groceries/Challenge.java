import java.util.ArrayList;
import java.util.Scanner;

import com.sun.javafx.sg.prism.GrowableDataBuffer;

public class Challenge {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
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

    System.out.println("What do you want to search for?");
    query = in.next();

    search(groceries, query);
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

  public static void search(ArrayList<String> groceries, String query) {
    int right = groceries.size() - 1;
    int left = 0; 
    int middle = right / 2;
    int queryInd = 0;
    boolean again = true;
    boolean found = false;
     
    do {
      if (query.equals(groceries.get(middle))) {
        again = false;
        found = true;
        queryInd = middle;
      } else if (left == right) {
        found = false;
        again = false;
      } else if (isMinor(groceries.get(middle), query)) {
        left = middle + 1;
        middle = left + (right - left)/2;
      } else if (isMinor(query, groceries.get(middle))) {
        right = middle - 1;
        middle = left + (right - left)/2;
      }
    } while (again);

    if (found) {
      System.out.println("The position of your search is " + queryInd);
    } else {
      System.out.println("There is no " + query + " in this list.");
    }
    /**
     * 1. Compare query with middle pos
     * 1.1 If equal:
     * 1.1.1 Return index
     * 
     * 1.2 If middle is minor than query:
     * 1.2.1 index must be at the right
     * 1.2.2 new left is middle
     * 
     * 1.3 If middle is mayor than query:
     * 1.3.1 index must be at left
     * 1.3.2 new right is middle
     * 1.3.3 get new middle and repeat
     * 
     * repeat until index is found
     */

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