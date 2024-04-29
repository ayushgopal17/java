import java.util.*;

 class students {
private String rollno;
private static int count=1;
private String asssigRollNo()
{
    Date d=new Date();
    String rno="Univ-"+(d.getYear()+1900)+"-"+count;
    count++;
    return rno;

}
students()
{
    rollno=asssigRollNo();

}
public String getRollno()
{
    return rollno;
}
    }
    public class Main {
        public static void main(String[] args) {
            students s1=new students();
            students s2=new students();
            students s3=new students();
            System.out.println(s1.getRollno());
            System.out.println(s2.getRollno());
            System.out.println(s3.getRollno());
        }
}

