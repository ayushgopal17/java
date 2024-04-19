
class parent
{
     parent()
     {
         System.out.println("Non param of parent");
     }
     parent(int x)
     {
         System.out.println("Param of parent ");
     }
    }
    class child extends parent
    {
        child()
        {
            System.out.println("Non param of child");
        }
        child (int y)
        {
            System.out.println("param of child");
        }
    }
    public class Main
    {
        public static void main(String[] args) {
            child c=new child();
        }

    }




















