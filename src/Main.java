import java.util.*;
import java.time.*;
import java.time.temporal.*;



class Main {


    public static void main(String[] args) {

        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalTime t1=t.minusHours(6);
        System.out.println(t1);
    }
}