import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter numbers: ");
        int num = in.nextInt();
        int count = 0;
        while (num != -1){
          count ++;
          num = in.nextInt();
        }
        if (num == -1){
          System.out.println(count + " numbers were entered.");
        }
    }
}
