import java.util.Scanner;

public class OnlyHigh
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();

        // YOUR CODE HERE
        int i = 0;
        for(i = 0; i < word.length() - 1; i++){
          if (word.substring(i, i + 2).equals("hi")){
            System.out.println("hi");
          }
        }

    }
}