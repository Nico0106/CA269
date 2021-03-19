import java.util.Scanner;

public class FirstShallBeLast
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();

        // YOUR CODE HERE
        System.out.println(Test.firstShallBeLast(word));

    }
}
