import java.util.Scanner;

public class ReducedString
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an string and a string: ");
        int position = in.nextInt();
        String word = in.next();

        String newWord = word.replace(word.substring(position, position + 1), "");
        // Use the substring() method of the String class.
        System.out.println(newWord);
    }
}
