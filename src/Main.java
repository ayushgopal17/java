
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int A[][] = new int[5][5];

        int B[][] = {{1, 2, 3}, {2, 4, 6}, {1, 3, 5}};

        for (int x[] : B) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}





