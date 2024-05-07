@FunctionalInterface
interface Mylambda {
    public void display();
}
public class Main
    {
        public static void main(String[] args)
        {
            Mylambda m=()->{System.out.println("Hello World");};
m.display();
        }
    }
