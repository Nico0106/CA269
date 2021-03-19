public class Test
{
  public static int getSum(int [] array)
  {
    int i = 0;
    int sum = 0;
    for (i = 0; i < array.length; i++){
      sum = sum + array[i];
    }
    return sum;
  }
}
