public class Product1Test
{
  public static void main(String [] args){
    Product1 prod;
    prod = new Product1("ccc001", 10);
    System.out.println(prod.code + " " + prod.price);
    prod.reducePrice(0.5);
    System.out.println(prod.code + " " + prod.price);

    Book book;
    book = new Book();
    System.out.println(book.code + " " + book.price);

  }
}
