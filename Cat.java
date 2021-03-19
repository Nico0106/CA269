// Modify this class so that it implements the Order interface
public class Cat implements Order
{
    private String name;

    public Cat(String n)
    {
        name = n;
    }

    public String toString()
    {
        return "cat: " + name;
    }

    public boolean lessThan(Order p){
      Cat otherCat = (Cat) p;
      return this.name.length() < otherCat.name.length();
    }
}
