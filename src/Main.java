import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str1="acc";

        // this wiil be false beacuse + means 1 or more and * means 0 or more

        System.out.println(str1.matches("[abc]{3}"));


    }
}