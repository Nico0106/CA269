public class Period
{
  private Time start;
  private Time end;

  public Period(Time time1, Time time2){
    start = time1;
    end = time2;
  }

  public boolean overlaps(Period otherperiod){

		if (start.isLater(otherperiod.end) && end.isLater(otherperiod.end)){
			return false;
		}
    else if(end.isLater(otherperiod.start) && start != otherperiod.end){
		return true;
    }
    else if(start.isLater(otherperiod.start) && end.isLater(otherperiod.end)){
      return false;
    }
    return false;
	}

  public String toString(){
		return start + " -> " + end;
	}
}
