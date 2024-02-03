import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

float a,b,c;
double r1,r2;
        System.out.println("give the the value of a which is the coefficient of x^2 ");
        a= sc.nextFloat();
        System.out.println("give the the value of b which is the coefficient of x");
        b=sc.nextFloat();
        System.out.println("give the value of c which is constant term");
        c= sc.nextFloat();
        r1= (-b+(Math.sqrt(b*b-4*a*c)))/2*a;
        r2= (-b-(Math.sqrt(b*b-4*a*c)))/2*a;
        System.out.println("one root of the equation is " + r1 );
        System.out.println("another root of the equation is " + r2);

    }

}