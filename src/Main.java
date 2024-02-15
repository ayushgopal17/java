import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str1="john@gmail.com";

        // .* means here dot means anything and * means any no. of times and combine it says any thing any no. of times before

        System.out.println(str1.matches("\\w*@gmail(.*)"));


    }
}