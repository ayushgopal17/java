import java.io.FileOutputStream;
import java.util.*;
import java.util.Map.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
        p.setProperty("brand","dell");
        p.setProperty("processor","i7");
        p.setProperty("os","windows10");
        p.setProperty("model","lattitude");

        p.store(new FileOutputStream("/Users/ayushgopal/java.txt"),"laptop");
    }
}