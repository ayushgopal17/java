import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  Package main;

        Scanner scanner =new Scanner(System.in);

        System.out.println("please enter a number");
    int n = scanner.nextInt();

    if(n>=14 && n<=55  )
        {
            System.out.println("you are young");
        }
        else {
            System.out.println("you are not young");
        }
    }
}
