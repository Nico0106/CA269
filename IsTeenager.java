import java.util.Scanner;

public class IsTeenager
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.println(Teen.isTeenager(age));
    }
}
