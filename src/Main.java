import java.util.*;

public class Main {
    public static void main(String[] args) {
        int A[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int B[][] = {{1,0,0}, {0, 1, 0}, {0,0,1}};

         int C[][]=new int [3][3];
         for(int i=0;i<3;i++) {
             for (int j = 0; j < 3; j++) {
                 C[i][j] = 0;
                 for (int K = 0; K < 3; K++) {
                     C[i][j] = C[i][j] + A[i][K] * B[K][j];
                 }

             }
         }
     for(int x[]:C)
     {
         for(int y:x)
         {
             System.out.print(y+" ");
         }
         System.out.println("");
     }
}


}






