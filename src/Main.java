class phone
{
    public void call() {System.out.println("phone call");}
    public void sms() {System.out.println("Phone sending sms");}
    }
    interface Icamera
    { void click();
        void record();
    }

    interface Imusicplayer
    { void play();
        void stop();
    }

    class Smartphone extends phone implements Icamera
    {
        public void videocall() {System.out.println("smart phone video calling");}
        public void click() {System.out.println("smartphone clicking photos");}
        public void record() {System.out.println("smartphone recording video");}

        public void play() {System.out.println("smart phone playing music");}
    }

   public class Main
   {
       public static void main(String[] args)
       {
         Icamera sp=new Smartphone();
        sp.click();

       }

}
