import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int A[] = {30, 20, 10, 40, 0};
          try {
              int c = A[0] / A[2];

              System.out.println("division is " + c);
              try {
                  System.out.println(A[5]);
              }
        catch(ArrayIndexOutOfBoundsException e)

                  {
                      System.out.println("Index is invalid");
                  }

              } catch (ArrayIndexOutOfBoundsException e) {
                  System.out.println("Index is invalid");
              }

              System.out.println("bye");

          }
    }


