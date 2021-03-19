import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int i;
        for(i = num; i <= 20; i++){
          System.out.print(i + " ");
        }
        System.out.println();
    }
}
