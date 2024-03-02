import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("printing to print fibonacci series");
        System.out.println("Enter a the Terms");

        int n =scanner.nextInt();

        int a=0,b=1,c;
        System.out.print(a+"," +b+",");

        for (int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;

        }
        }

}