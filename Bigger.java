import java.util.Scanner;

public class Bigger
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        if (number1 > number2){
          System.out.println(number1 + " is the biggest.");
        }
        else{
          System.out.println(number2 + " is the biggest");
        }
    }
}
