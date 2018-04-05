import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String in1, in2;

    System.out.println("Insert Two Numbers: ");
    in1 = in.nextLine();
    in2 = in.nextLine();
    in.close();

    double d1 = Double.parseDouble(in1);
    double d2 = Double.parseDouble(in2);
    double result = d1 + d2;

    StringBuilder stb = new StringBuilder("Your result is");
    stb.append(" ");    
    stb.append(result);    

    System.out.println(stb);

  }

}