import java.io.*;
import java.util.Date;

class Student
{
    int rollno;
    String name;
    String Dept;

}
public class Main {
    public static void main(String[] args) throws Exception {
FileOutputStream fos=new FileOutputStream("C:\\myjava\\student.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        Student s=new Student();
        s.rollno=10;;
        s.name="John";
        s.Dept="CSE";
        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.Dept);

        dos.close();
        fos.close();

    }
}