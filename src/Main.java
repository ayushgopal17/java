import java.util.*;
import java.util.Map.*;
public class Main {

    public static void main(String[] args) {
        Hashtable  ht=new Hashtable();


      ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");


        ht.computeIfAbsent(7,(k)->"Z"+k);
        System.out.println(ht);




    }
}