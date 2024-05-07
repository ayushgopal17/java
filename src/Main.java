interface MyLambda
{
    public void display(String str);
    }
    public class Main {
      public Main(String s) {
          System.out.println(s.toUpperCase());
      }

        public static void main(String[] args) {
            MyLambda ml=Main::new;
            ml.display("hello");
        }
      }



