import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int size = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter " + size + " numbers: ");
        int i = 0;
        double [] array;

        array = new double [size];
        for (i = 0; i < size; i ++){
          array[i] = in.nextDouble();
        }

        double count = 0;
        for (i = 0; i < size; i ++){
          count = count + array[i];
        }

        System.out.println("The average is " + count / size);
    }
}
