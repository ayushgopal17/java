

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {

  int a[]={2,4,6,8,1,3,5};
  int b[]={2,4,6,8,1,3,5};

  int c[]=Arrays.copyOf(a,a.length);
Arrays.fill(c,10);
for (int x:c)
        System.out.println(x);

    }
}