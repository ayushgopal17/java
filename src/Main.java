
class Super
{
    public void display()
    {
        System.out.println("Super class display");
    }
    }
class Sub extends Super
        {
            @Override
            public void display() {


                System.out.println("sub class display");
            }
        }
        public class Main {

            public static void main(String[] args) {
                Super sup=new Super();
                sup.display();

                Sub S=new Sub();
                S.display();
            }
}



















