public class Test
{
  public static int countEven(int [] array)
  {
    int i = 0;
    int even = 0;
    for (i = 0; i < array.length; i++){
      if(array[i] % 2 == 0){
        even ++;
      }
    }
    return even;
  }
}
