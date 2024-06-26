import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
import java.time.temporal.*;



class DateTimeFormat {


    public static void main(String[] args) {
        ZonedDateTime dt = ZonedDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH.mm.ss z Z");
        System.out.println(df.format(dt));
    }
}