public class Product1
{
  String code;
  double price;

  public Product1(String c, double p){
    code = c;
    price = p;
  }

  public void reducePrice(double percent){
    price = price * percent;
  }
}
