import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Package main;


        Scanner scanner = new Scanner(System.in);

        String num ;

        System.out.println("please enter  number ");
num= scanner.nextLine();

       if(num.matches("[01]+"))
               {
                       System.out.println("binary");
      }
       else if (num.matches("[0-7]+")) {
           System.out.println("octal");
       }
       else if (num.matches("[0-9]+"))
       {
           System.out.println("decimal");

       }
       else if (num.matches("[0-9A-F]+"))

       {
           System.out.println("hexadecimal");
       }
       else
       {
           System.out.println("not a number");

       }
    }

}


