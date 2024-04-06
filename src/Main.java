// here polymophism is used it means out of two methods whichever is required is being used out of these two
public class Main {
    static void showList(String ...S)
    { for(int i=0;i<S.length;i++) {
        System.out.println(i + 1 + ". " + S[i]);
    }
    }

    public static void main(String[] args) {
        showList("Ajay","john","smith","ahmed","mark");
    }
}






