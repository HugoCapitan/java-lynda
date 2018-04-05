import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String in1, in2;
    double v1, v2, result = 0;
    char op;

    try {
      System.out.println("Enter the numbers to operate on:");
      in1 = in.next();
      System.out.println("");
      v1 = Double.parseDouble(in1);

      in2 = in.next();
      System.out.println("");
      v2 = Double.parseDouble(in2);

      System.out.println("Enter the operation you want to perform (+ - * /): ");
      op = in.next().charAt(0);
      System.out.println("");

      switch (op) {
        case '+':
          result = v1 + v2;
          break;
        case '-':
          result = v1 - v2;
          break;
        case '*':
          result = v1 * v2;
          break;
        case '/':
          result = v1 / v2;
          break;
        default:
          throw (new Exception("Not a valid operation"));
      }

      System.out.println("The result is: " + result);

    } catch (NumberFormatException e) {
      System.out.println("That number you typed is invalid!");
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    
  }

}