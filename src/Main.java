import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a URL ");
        String URL=scan.nextLine();

        String protocol =URL.substring(0, URL.indexOf(":"));


        if(protocol.equals("http"))
            System.out.println("Hyper text transfer protocol");

         else if (protocol.equals ("ftp"))
            System.out.println("file transfer protocol");

        String ext=URL.substring(URL.lastIndexOf(".")+1);

        if(ext.equals("com"))
        System.out.println("commercial");
            else if (ext.equals("org"))
            System.out.println("organisation");
        else if (ext.equals("net"))
            System.out.println("network");

    }
}


