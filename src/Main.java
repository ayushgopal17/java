
abstract class Super {
    public void display() {
        System.out.println("super constructor");
    }

    public void meth1() {
        System.out.println("meth1 of super");
    }

    abstract public void meth2();
}
class Sub extends Super
        {
            @Override
public void meth2()
            {
                System.out.println("Sub meth2");
            }

        }
public class Main {
    public static void main(String[] args)
    {
        Super s=new Sub();

            s.meth1();
            s.meth2();

    }

}






















