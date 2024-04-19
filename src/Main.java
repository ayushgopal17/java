
class parent
{

     parent()
     {
         System.out.println("Non param of parent");
     }
     parent(int x)
     {
         System.out.println("Param of parent "+x);
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
        child(int x,int  y)
        {
            super(x);
            System.out.println("2 param of child "+y);
        }

    }
    public class Main
    {
        public static void main(String[] args) {
            child c=new child(10,20);
        }

    }




















