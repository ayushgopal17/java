import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        while (n>0)
        {
         int r=n%10;
            n=n/10;
            System.out.println(r);

        }

    }
}
