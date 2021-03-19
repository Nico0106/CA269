import java.util.Scanner;

public class LengthOfName
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();        // Note that the Scanner method, next(), reads in a word.

        int length = name.length();

        System.out.println("Hello " + name + ", your name has " + length + " letters.");
    }
}
