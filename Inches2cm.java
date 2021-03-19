import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Please enter a quantity in inches: ");

        int inches = in.nextInt();

        double cm = inches * 2.54;

        System.out.println(inches + " inch is " + cm);

    }
}
