import java.io.UncheckedIOException;

interface A{}

class B implements A{}
    class C implements A{}

@SuppressWarnings("Unchecked")

class MyArray<T>

{
    T A[]=(T[]) new Object[10];
    int length=0;
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for (int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}
public class Main {
    static <E> void show(E[] list)
    {
for (E x:list)
    System.out.println(x);
    }
    public static void main(String[] args) {

        show(new String[]{"hi","go","bye"});
    }
}