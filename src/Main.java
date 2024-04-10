class cylinder
{

    public double radius;
    public double height;


    public double lidarea()
    {
        return  Math.PI * radius * radius;
    }

    public double totalsurfacearea()
    { return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Main
{
    public static void main(String[] args) {
     cylinder c=new cylinder();
     c.radius=7;
     c.height=10;
        System.out.println("lidarea is "+c.lidarea());
        System.out.println("toTAL Surface area is "+c.totalsurfacearea());
        System.out.println("volume is "+c.volume());



    }
}





















