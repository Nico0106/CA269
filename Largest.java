import java.util.Scanner;

public class Largest
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);

        // Read in the three numbers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("Test.largest(" + a + ", " + b + ", " + c + ") is " + Test.largest(a, b, c));
    }
}
