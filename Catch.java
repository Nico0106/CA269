public class Catch
{
   public static void main(String [] args)
   {
      Broken broke = new Broken();

      System.out.println("Testing");
      try{
        broke.cracked();
      }
      catch(ArithmeticException e){
        System.out.println("ArithmeticException");
        System.out.println("Finally");
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException");
        System.out.println("Finally");
      }
      catch(NullPointerException e){
        System.out.println("NullPointerException");
        System.out.println("Finally");
      }
   }
}
