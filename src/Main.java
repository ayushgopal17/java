
import java.util.*;

public class Main{
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al12 = new LinkedList<>(List.of(40, 50, 60, 70, 80));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1, al12);
        al1.set(6, 200);
        al1.forEach(n->show(n));
    }
static void show (int n)
{

        System.out.println(n);

}

    }
