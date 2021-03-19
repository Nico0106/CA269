import java.util.Scanner;

public class Temp
{
  public static void main(String [] args)
  {
      Scanner in = new Scanner(System.in);
      System.out.print("Give me a Fahrenheit temperature: ");

      double fahr = in.nextDouble();

      double result = Convert.fahr2cels(fahr);

      System.out.println("In Celsuis tha would be: " + result);

  }
}
