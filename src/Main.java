
class Car {
    public void start(){System.out.println("car started");}
    public void accelerate(){System.out.println("Car is accelerated");}
    public void changeGear(){System.out.println("car gear changes");}
   }
   class luxurycar extends Car {
       public void ChangeGear() {
           System.out.println("Automatic gear changes");
       }

       public void openroof() {
           System.out.println("Sun roof is opened");
       }

   }

        public class Main {
            public static void main(String[] args) {
                luxurycar c = new luxurycar();
                c.start();
                c.accelerate();
                c.changeGear();
                c.openroof();

            }
}























