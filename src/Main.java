import java.util.*;

public class Main {

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println("Enter a number");
        long fact=1;
        for (int i = 1; i<=n;i++)

        {
            fact=fact*i;
        }
        System.out.println("Factorial of number "+n+" is "+fact);
    }
        }