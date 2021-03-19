public class Point implements Order
{
    private double x, y;

    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    public boolean lessThan(Order other){
        Point otherPoint = (Point) other;
        double thisOne = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        double otherOne = Math.sqrt(Math.pow(otherPoint.x, 2) + Math.pow(otherPoint.y, 2));
        return thisOne < otherOne;
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}

//sqrt(x ^ 2 + y ^ 2)
