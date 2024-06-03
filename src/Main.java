import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
import java.time.temporal.*;



class Main {


    public static void main(String[] args) {
LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
    }
}