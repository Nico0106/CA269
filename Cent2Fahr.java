import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        double tempC = in.nextDouble();

        double fahr = (tempC * 9/5) + 32;

        System.out.println((int) tempC + " " + fahr);

    }
}
