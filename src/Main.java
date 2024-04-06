// here polymophism is used it means out of two methods whichever is required is being used out of these two
public class Main {
    static void showList(int start,String ...S)
    { for(int i=0;i<S.length;i++) {
        System.out.println(start+"."+S[i]);
        start++;
    }
    }

    public static void main(String[] args) {
        showList(5,"Ajay","john","smith","ahmed","mark");
    }
}






