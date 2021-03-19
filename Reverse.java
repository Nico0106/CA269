import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int size = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter " + size + " numbers: ");

        int i = 0;
        int [] array;
        int tmp;

        array = new int [size];
        for (i = 0; i < size; i ++){
          array[i] = in.nextInt();
        }

        int j = size - 1;
        for (i = 0; i < size / 2; i++){
          tmp = array[i];
          array[i] = array[j];
          array[j] = tmp;

          j --;
        }

        System.out.print("The numbers reversed are:");
        for (i = 0; i < size; i++){
          System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}
