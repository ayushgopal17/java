import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     String str1="programmer@gmail.com";

       int i=str1.indexOf("@");

       String uname= str1.substring(0,i);
       String domainname=str1.substring(i+1, str1.length());

        System.out.println("username = "+uname);
        System.out.println("domainname = "+domainname);
        System.out.println(domainname.startsWith("gmail.com"));

      int j=domainname.indexOf(".");
       String name=domainname.substring(0,j);
        System.out.println(name.equals("gmail"));


    }
}