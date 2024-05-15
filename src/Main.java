
import java.util.*;

class MyCom implements Comparator<Integer>
{

    public int compare(Integer o1, Integer o2)
    {
     if (o1<o2) return 1;
     if (o1>o2) return -1;
     return 0;
    }
}
public class Main
{
    public static void main(String[] args)
    {
       PriorityQueue<Integer> P=new PriorityQueue<>(new MyCom());
       P.add(20);
       P.add(10);
       P.add(30);
       P.add(5);
       P.add(15);
       P.add(3);


        System.out.println(P.peek());
        P.forEach((x) -> System.out.println(x));

        P.poll();
        System.out.println("After Deletion");
        P.forEach((x) -> System.out.println(x));
    }
    }
