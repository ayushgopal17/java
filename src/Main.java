import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

float l,b,h,area,volume;
        System.out.println("lenth of the cuboid");
        l= sc.nextFloat();
        System.out.println("breadth of the cuboid");
        b= sc.nextFloat();
        System.out.println("height of the cuboid");
        h=sc.nextFloat();
         area=2*((l*b)+(b*h)+(h*l));
        System.out.println(" Total area of the cuboid is " + area);

        volume=l*b*h;

        System.out.println("volume of the cuboid is " + volume);

    }

}