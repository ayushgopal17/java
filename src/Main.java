
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int A[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println("Lenth of A "+A.length);
        int B[]=new int[10];

        for (int i=0;i<A.length;i++)
        {

            B[i]=A[i];
        }
        A=B;
        System.out.println("Length of A "+A.length);
        }

}



