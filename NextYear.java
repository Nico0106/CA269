import java.util.Scanner;

public class NextYear
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.next();        // Note that the Scanner method, next(), reads in a word.

        Scanner in1 = new Scanner(System.in);
        System.out.print("What age are you: ");
        int age = in.nextInt();
        int age2 = age + 1;
        System.out.print("Hello " + name + ", next year you will be " + age2 + ".");

    }
}
