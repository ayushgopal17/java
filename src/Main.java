import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     String r="             abc       de               fgh   i";

       r=r.replaceAll("\\s+"," ").trim();

        String words[]=r.split("\\s");

        System.out.println(words.length);

    }
}