import java.util.*;
import java.util.Map.*;
public class Main {

    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>(10);



     hs.add("A");
hs.add("C");
hs.add("E");
        hs.add("G");
        hs.add("K");
        hs.add("B");

    hs.forEach(System.out::println);


    }
}