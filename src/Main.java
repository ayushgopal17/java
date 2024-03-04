
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10};

        System.out.println("Enter a key");



       int  key=scanner.nextInt();
        for(int i=0;i<A.length;i++)
        {
        if(A[i]==key)
        {
            System.out.println("Element found at "+i);
            System.exit(0);
        }


     }
        System.out.println("Element not found");
    }
         }


