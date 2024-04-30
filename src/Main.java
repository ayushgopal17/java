
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {


            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("denominator should not be 0, try again");
        }
        System.out.println("bye");
    }
    }


