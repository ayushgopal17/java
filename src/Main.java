

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
    public static void main(String[] args) throws Exception {
        MyThread t=new MyThread();
        t.setDaemon(true);
        t.start();

        Thread mainThread=Thread.currentThread();
        mainThread.join();


        }
    }
