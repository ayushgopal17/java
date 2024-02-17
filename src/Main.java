import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Package main;

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter  marks m1, m2, m3 ");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();


        System.out.println("total =" + (m1 + m2 + m3));
        int average =( (m1 + m2 + m3) / 3);

        System.out.println(average);
if (average>=70)
        {
            System.out.println("A");
        }

        else if (average>=60 && average<=70)
        {
            System.out.println("B");
        }

else if (average>=50 && average<=60)
{
    System.out.println("C");
}

else if (average>=40 && average<=50)
{
    System.out.println("A");

}
else if (average<40)
{
    System.out.println("F");
}

    }
}