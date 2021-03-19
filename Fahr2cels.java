import java.util.Scanner;

public class Fahr2cels
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me a Fahrenheit temperature: ");

        double fahr = in.nextDouble();


        double result = Temp.fahr2cels(fahr);

        System.out.println("In Celsuis tha would be: " + result);

    }
}
