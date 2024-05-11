

public class Main<T>
{
    T data[]=(T[]) new Object[3];
    public static void main(String[] args)
    { Main<String> gd = new Main();
        gd.data[0]="hi";
        gd.data[1]="bye";
        gd.data[2]=new Integer(10);
        String str=gd.data[0];
    }

}