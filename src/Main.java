class Rectangle
{
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
      public double getBreadth()
    {
        return breadth;
    }

    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth(double b)
    {
        breadth=b;
    }
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
        if(length==breadth)
            return true;
        else
            return false;
    }

}

public class Main {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();

        r.setLength(10.5);
        r.setBreadth(5.5);

        System.out.println("Area "+r.area());
        System.out.println("perimeter "+r.perimeter());

        System.out.println("Is it a Square "+r.isSquare());
        System.out.println(" length "+r.getLength());
        System.out.println(" breadth "+r.getBreadth());
    }

}


















