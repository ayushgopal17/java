// here polymophism is used it means out of two methods whichever is required is being used out of these two
public class Main {
    static int max(int x, int y) {
        return x > y ? x : y;
    }
static int max(int x, int y,int z)
{
    if(x>y && x>z)
        return x;
    else if(y>z)
        return y;
    else
        return z;
}
    public static void main(String[] args) {
        System.out.println(max(10,5,15));


    }
}






