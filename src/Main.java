
import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al12 = new ArrayList<>(List.of(40, 50, 60, 70, 80));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1, al12);
        al1.set(6, 200);
        al1.forEach(n->show(n));
    }
static void show (int n)
{
    if (n > 60)
        System.out.println(n);

}

    }
