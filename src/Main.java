import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("printing GP of a number");
        System.out.println("Enter a, r and n");

        int a =scanner.nextInt();
        int r =scanner.nextInt();
        int n =scanner.nextInt();

         int term =a;
        for (int i=0;i<n;i++)
        {
            System.out.print(term+" ");
             term=term*r;
        }
    }
}