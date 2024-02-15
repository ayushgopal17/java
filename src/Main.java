import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     String str1="programmer@gmail.com";

       int i=str1.indexOf("@");

       String uname= str1.substring(0,i);
       String domainname=str1.substring(i+1, str1.length());

        System.out.println(uname);
        System.out.println(domainname);
    }
}