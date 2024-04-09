// package java1;
class Main {
    public double radius;

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}

public class Main1 {

    public static void main(String[] args) {
        Main c1 = new Main();
        c1.radius = 7;

        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
    }
}











