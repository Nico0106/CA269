public class Time
{
  private int hour;
  private int minute;

  public Time(String line){
    hour = Integer.parseInt(line.substring(0, 2));
    minute = Integer.parseInt(line.substring(2, 4));
  }

  public String toString(){
    if (String.valueOf(hour).length() == 2 && String.valueOf(minute).length() == 1){
      return hour + ":" + "0" + minute;
    }
    else if (String.valueOf(hour).length() == 1 && String.valueOf(minute).length() == 1){
      return "0" + hour + ":" + "0" + minute;
    }
    else if (String.valueOf(hour).length() == 1 && String.valueOf(minute).length() == 2){
      return "0" + hour + ":" + minute;
    }
    else if (String.valueOf(hour).length() == 2 && String.valueOf(minute).length() == 2){
      return hour + ":" + minute;
    }
    return hour + ":" + minute;
  }

  public boolean isLater(Time time2){
    if (this.hour > time2.hour){
      return true;
    }
    else if(this.hour == time2.hour){
      if(this.minute > time2.minute){
        return true;
      }
    }
    return false;
  }
}
