
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
       ArrayList<Integer> al1 =new ArrayList<>(20);
        ArrayList<Integer> al12 =new ArrayList<>(List.of(40,50,60,70,80));

       al1.add(10);
       al1.add(0,5);
       al1.addAll(al12);

        System.out.println(al1);
    }
}