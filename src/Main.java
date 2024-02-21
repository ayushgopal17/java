import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a website");
        String Website=scan.nextLine();
        String ext=Website.substring(Website.lastIndexOf(".")+1);
        switch (ext)
        {
            case "com":
                System.out.println("commercial");
                break;
            case "org":
                System.out.println("organisation");
                break;
            case "gov":
                System.out.println("government");
                break;
            case "net":
                System.out.println("network");
                break;
        }

    }
}