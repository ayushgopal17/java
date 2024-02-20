import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Package main;


        Scanner scanner = new Scanner(System.in);

        int day;

        System.out.println("please enter a number number ");

        day = scanner.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("wednesday");
        } else if (day == 4) {
            System.out.println("Thusday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("saturday");
        }
        else if (day == 7) {
            System.out.println("sunday");
        }
        else
        {
            System.out.println("invalid Day number");
        }
    }
}



