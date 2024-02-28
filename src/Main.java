import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int m = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        System.out.println(sum);
        if (sum == m)

            System.out.println("Armstrong number");
        else System.out.println("Not an Armstong number");
    }
}
