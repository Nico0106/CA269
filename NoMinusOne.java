import java.util.Scanner;

public class NoMinusOne
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter numbers: ");
        int num = in.nextInt();
        int pen = 0;
        while (num != -1){
          pen = num;
          num = in.nextInt();
        }
        if (num == -1){
          System.out.println("The penultimate number was: " + pen);
        }
    }
}
