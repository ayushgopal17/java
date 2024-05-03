

class MyThread extends Thread
{
    public void run()
    {
        int count=1;
        while (true) {

            System.out.println(count++ +"My Thread");
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception
    {
        MyThread t=new MyThread();
        t.start();
        int count=1;

        while (true)
        {
           System.out.println(count++ +"Main");
           Thread.yield();
        }

        }
    }
