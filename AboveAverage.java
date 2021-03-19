import java.util.Scanner;

public class AboveAverage
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


        int size2 = 0;
        int j = 0;
        for (i = 0; i < size; i++){
          if (array[i] > (count / size)){
            size2 ++;
          }
        }

        double [] above;
        above = new double [size2];

        i = 0;
        j = 0;
        while (i < size){
          if (array[i] > (count / size)){
            above[j] = array[i];
            j ++;
          }
          i ++;
        }

        System.out.print("The above average numbers are:");
        for (i = 0; i < size2; i++){
          System.out.println(" " + above[i]);
        }
        System.out.println();
    }
}
