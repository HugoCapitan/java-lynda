import java.util.Scanner;
import movies.Movie;

public class Challenge {
  
  public static void main(String[] args) {
    String name, rating;
    int year, runtime;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the data of your favourite movie below.");
    System.out.print("Name: ");
    name = in.next();
    System.out.print("Rating: ");
    rating = in.next();
    System.out.print("Year: ");
    year = in.nextInt();
    System.out.print("Runtime: ");
    runtime = in.nextInt();

    Movie favourite = new Movie(name, rating, year, runtime);

    System.out.println("");
    System.out.println("Heres the data of your favourite movie conveniently formatted:");
    System.out.println(favourite.toString());

  }

}