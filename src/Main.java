import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program to print AP series");
        System.out.println("Enter a, d, and n");
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

     int term=a;
     for(int i=0;i<n;i++)
     {
         System.out.print(term+" ");
               term=term+d;

     }
}
    }

