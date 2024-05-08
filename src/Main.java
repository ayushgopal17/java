

import java.io.*;

public class Main{

    public static void main(String[] args) throws Exception
    {

        try(FileInputStream fis=new FileInputStream("C:/MyJava/Test.txt");) {

           int x;
           do {
               x = fis.read();

               if (x != -1)
                   System.out.println( (char)x);}
           while (x!=-1);
            {
                System.out.println((char)x);
            }
        }
    }

}


