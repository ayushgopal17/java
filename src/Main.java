
class TV {
    public void switchON() {
        System.out.println("TV IS SWITCHED ON");}
    public void changeChannel() {
        System.out.println("TV channel is changes");}
}
   class SmartTV extends TV
   {
           @Override
           public void switchON() {
           System.out.println(" SMARTTV IS SWITCHED ON");}
           @Override
           public void changeChannel() {
           System.out.println("SMARTTV channel is changes");}
       public void browse(){System.out.println("SMART TV BROWSING");
       }

   }

        public class Main {
            public static void main(String[] args)
            {  TV t=new SmartTV();

               t.switchON();
               t.changeChannel();


            }
            }




















