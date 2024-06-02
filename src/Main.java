import java.util.*;
import java.time.*;
import java.time.temporal.*;



class Main {


    public static void main(String[] args) {

        LocalDate d=LocalDate.parse("2024-01-03");
        LocalDate d1=d.plusMonths(6);
        System.out.println(d1);
    }
}