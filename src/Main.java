import java.util.*;
import java.util.Map.*;
public class Main {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5);



     lhm.put(1,"A");
lhm.put(2,"B");
lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        lhm.put(6,"F");

        lhm.forEach((k,v)-> System.out.println(k+" "+v));


    }
}