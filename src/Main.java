import java.util.*;
import java.util.Map.*;
public class Main {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);



     lhs.add("A");
lhs.add("C");
lhs.add("E");
        lhs.add("G");
        lhs.add("K");
        lhs.add("B");

    lhs.forEach(System.out::println);


    }
}