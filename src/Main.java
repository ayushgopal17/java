


import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        byte b[]={'a','b','c','d','e','f','g'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        String str=new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();
    }
}
