import java.util.Scanner;

public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int i;
        for(i = 1; i <= num; i++){
          System.out.print(i + " ");
        }
        System.out.println();
    }
}
