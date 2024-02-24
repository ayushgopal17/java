import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      //  int n;
       Scanner scanner= new Scanner(System.in);
       int n=scanner.nextInt();
        System.out.println("enter a number");
        for(int i=1 ;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}