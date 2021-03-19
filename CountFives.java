public class Test
{
  public static int countFives(int [] array)
  {
    int i = 0;
    int fives = 0;
    for (i = 0; i < array.length; i++){
      if(array[i] == 5){
        fives ++;
      }
    }
    return fives;
  }
}
