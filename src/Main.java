import java.lang.annotation.Annotation;
@interface myAnno
{
    String name();
    String Project();
    String Date() default "today";
    String Version()default "13";
}

@myAnno (name ="Ajay",Project ="Bank")
        public class Main
{
int data;

    public static void main(String[] args) {
        int x;
    }
}