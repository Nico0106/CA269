import java.util.Scanner;

public class SumNumber
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i;
        int sum = 0;
        for(i = 1; i <= num; i++){
          sum = sum + i;
        }
        System.out.println("The sum of the number from 1 to " + num + " is " + sum);
    }
}
