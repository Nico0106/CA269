import java.util.Scanner;

public class StringReproduction
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter an integer and a string: ");
        int num = in.nextInt();
        String word = in.next();
        int i = 0;
        for(i = 1; i <= num; i++){
          System.out.print(word);
        }
        System.out.println();
    }
}
