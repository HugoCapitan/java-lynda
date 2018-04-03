package movies;

public class Movie {
  private String name;
  private String rating;
  private int year;
  private int runtime;

  public Movie(String name, String rating, int year, int runtime) {
    this.name = name;
    this.rating = rating;
    this.year = year;
    this.runtime = runtime;
  }

  public String toString() {
    return "Movie:" +
      "\nName: " + name +
      "\nRating: " + rating +
      "\nYear: " + year +
      "\nRuntime: " + runtime;
  }
}