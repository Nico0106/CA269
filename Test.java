public class Test
{
    public static void reverse(int [] array)
    {
      int tmp;
      int i;
      int j = array.length - 1;
      for (i = 0; i < array.length / 2; i++){
        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

        j --;
      }
    }
}
