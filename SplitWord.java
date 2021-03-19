import java.util.Scanner;

public class SplitWord
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a word: ");
        String word = in.next();
        int i = 0;
        for(i = 0; i < word.length() - 1; i++){
          System.out.println(word.substring(i, i + 2));
        }
    }
}
