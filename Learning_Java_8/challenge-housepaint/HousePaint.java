import java.util.Scanner;

public class HousePaint {

  public static void main(String[] args) {
    double houseW, houseH, houseL, houseSurface, surfacePerGallon, necessaryPaint, doorsSize, windowsSize;
    int doors, windows;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the width of the house.");
    houseW = in.nextDouble();
    System.out.println("Enter the length of the house.");
    houseL = in.nextDouble();
    System.out.println("Enter the height of the house.");
    houseH = in.nextDouble();

    System.out.println("Enter the number of doors your house has.");
    doors = in.nextInt();
    System.out.println("Enter the number of windows your house has.");
    windows = in.nextInt();
    System.out.println("Enter the size of the doors.");
    doorsSize = in.nextDouble();
    System.out.println("Enter the size of the windows.");
    windowsSize = in.nextDouble();

    System.out.println("Enter the surface per gallon.");
    surfacePerGallon = in.nextDouble();
    
    houseSurface = (houseW * houseL) + (2 * houseW * houseH) + (2 * houseL * houseH) - (windows * windowsSize) - (doors * doorsSize);
    necessaryPaint = houseSurface / surfacePerGallon;
    System.out.printf("You'll need " + necessaryPaint + " gallons of paint since your house's surface is: %5.2fm", houseSurface);
  }

}