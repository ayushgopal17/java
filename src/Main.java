
import java.io.*;

public class Main {
        static int area (int l,int b) throws Exception
        {
            if(l<0 || b<0)
                throw new Exception();
            return l*b;
        }
        static void meth1() throws Exception
        {
            System.out.println("area is "+area(10,5));
        }

    public static void main(String[] args) throws Exception
    {
        meth1();
    }
    }

