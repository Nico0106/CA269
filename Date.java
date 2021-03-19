import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;
    public Date(){
      day = 1;
      month = 1;
      year = 2000;
    }
    public boolean isOnOrAfter(Date day2){
      if (this.year < day2.year){
        return false;
      }
      else if (this.year > day2.year){
        return true;
      }
      if (this.month < day2.month){
        return false;
      }
      else if (this.month > day2.month){
        return true;
      }
      if (this.day < day2.day){
        return false;
      }
      else if (this.day > day2.day){
        return true;
      }
      return true;
    }
    public Date(String date){
      day = Integer.parseInt(date.split(" ")[0]);
      month = Integer.parseInt(date.split(" ")[1]);
      year = Integer.parseInt(date.split(" ")[2]);
    }
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);

      String line;
      Date starter = new Date("0 0 0dis");
      while(in.hasNextLine())
      {
         line = in.nextLine();
         if(line.length() != 0)
         {
            Date date = new Date(line);
            // Do what you want with the date.
            if (date.isOnOrAfter(starter)){
              starter = date;
            }
         }

      }
      System.out.println(starter); // Print the latest date
    }

}
