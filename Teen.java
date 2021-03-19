import java.util.Scanner;

public class Teen
{
    // Fill in the main method
    public static boolean isTeenager(int age)
    {
        boolean verdict = age > 12 && age < 20;
        String not = "";
        if (!verdict){
          return false;
        }
        else{
          return true;
        }
    }
}
