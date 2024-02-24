import java.util.*;

public class Main {
    public static void main(String[] args)
    {

       Scanner scanner= new Scanner(System.in);
       int n=scanner.nextInt();
        System.out.println("enter a number");

        int sum=0;
        for(int i=1 ;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of " +n+ " Number is "+sum);
    }
}