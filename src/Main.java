import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("===");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");

        System.out.println("Enter two numbers");
       int x = scan.nextInt();
       int y = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter options in words same as written above");
        String options = scan.nextLine();
        switch (options)
        {  case "Add":
                System.out.println("the sum is "+(x+y));
                break;
            case "Sub":
                System.out.println("the diffrence is "+(x-y));
                break;
            case "Mul":
                System.out.println("the multiplication is "+(x*y));
                break;
            case "Div":
                System.out.println("the division is "+(x/y));
                break;
            default:
                System.out.println("invalid option");
        }

    }
}