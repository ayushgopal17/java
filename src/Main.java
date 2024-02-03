import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

float B,H;
        System.out.println("enter base");
        B=sc.nextFloat();
        System.out.println("enter height");
        H=sc.nextFloat();
        float ans=(B*H)/2;


        System.out.println(ans);
    }

}