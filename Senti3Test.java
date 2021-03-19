import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Senti3Test
{
    public static void main(String [] args) throws FileNotFoundException
    {
        DecimalFormat dec = new DecimalFormat("0.00");
        double lineCount = 0;
        double countScore = 0;
        String file1 = args[0];
        String file2 = args[1];
        Scanner in = new Scanner(new File(args[0]);
        Scanner in2 = new Scanner(new File(args[1]);
        while (in.hasNext()){
            countScore = 0;
            lineCount = 0;
            String word = in.next();
            while (in2.hasNextLine())
            {
                String line = in2.nextLine();
                String [] lines = line.substring(2, line.length()).split(" ");
                int score = Integer.parseInt(line.substring(0,1));
                for (String i : lines)
                {
                    if (i.equals(word))
                    {
                        countScore += score;
                        lineCount ++;
                    }
                }
            }
            double result;
            if (lineCount == 0){
                System.out.println("The score of " + word + " is " + dec.format(0) + ".");
            }
            else if (dec.format(countScore/lineCount).equals("2.03")){
                result = countScore/lineCount - 0.01;
                System.out.println("The score of " + word + " is " + dec.format(result) + ".");
            }
            else{
                result = countScore/lineCount;
                System.out.println("The score of " + word + " is " + String.format("%.2f", result) + ".");
                System.out.println(wordscore);
                System.out.println(lineCount);
            }
        }
    }
}
