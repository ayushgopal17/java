import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

float a,b,c,s;
 double Area;
        System.out.println("enter value of a");
        a= sc.nextFloat();
        System.out.println("enter value of b");
        b= sc.nextFloat();
        System.out.println("enter the value of c");
        c= sc.nextFloat();
       s=(a+b+c)/2;
        Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("slant height of the Traingle = "+ s );

        System.out.println("Area of the Trangle is " + Area);
        
    }

}