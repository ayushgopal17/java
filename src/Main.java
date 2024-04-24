
class Super
        {

public void display()
{
    System.out.println("super display");

}


}
class Sub extends Super
        {
            @Override
public void display()
            {
                System.out.println("Sub Display");
            }

        }
public class Main {
    public static void main(String[] args)
    {
        Super s=new Sub();

            s.display();

    }

}






















