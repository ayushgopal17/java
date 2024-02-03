import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

int B,H;
        System.out.println("enter base");
        B=sc.nextInt();
        System.out.println("enter height");
        H=sc.nextInt();
        int ans=(B*H)/2;


        System.out.println(ans);
    }

}