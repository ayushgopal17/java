
class Rectangle2
{
    public double length;
    public double breadth;

    public double area()
    {
        return length*breadth;
    }
public double perimeter()
{
    return 2*(length+breadth);
}
    public boolean isSquare()
    {
       if (length==breadth)
          return true;
          else
              return false;
    }
}
public class Main {

    public static void main(String[] args) {
        Rectangle2 r=new Rectangle2();
        r.length=10.5;
        r.breadth=5.5;
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is it a square "+r.isSquare());

    }
}











