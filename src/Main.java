

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        String data = "name=vijay adress=delhi country=india dept=cse";

        StringTokenizer stk = new StringTokenizer(data, "= ");
        String s;

        while (stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
        }

       }
}