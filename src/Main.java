import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
		int m=n;
      int  rev=0;
while (n>0)
{
 int  r=n%10;
   rev=rev*10+r;
   n=n/10;
}
		System.out.println(rev);
if (rev==m)
	System.out.println("the number is palidrome");
else
	System.out.println("its not a palidrome");

    }
}
