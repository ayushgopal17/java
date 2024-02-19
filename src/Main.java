import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Package main;


        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("please enter  number ");

        num = scanner.nextInt();

        if ((num % 4)== 0) {

            if (num % 100 == 0) {

                if (num % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println("not a leap year");
            }
        }}}



