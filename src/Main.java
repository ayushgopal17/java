class students {

    public int roll;
    public String name;
    public String Course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float Average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (Average() >= 60)
            return 'A';
        else
            return 'B';

    }


    public String details() {
        return "Roll no:" + roll + "\n" + "Name:" + name + "\n" + "Course:" +Course + "\n";
    }
}

public class Main {

    public static void main(String[] args) {

        students s=new students();
        s.roll=1;
        s.name="Ayush" ;
        s.Course="CS";
        s.m1=70;
        s.m2=80;
        s.m3=65;

        System.out.println("Total:"+s.total());
        System.out.println("Average:"+s.Average());
        System.out.println("Details:\n "+s.details());
    }
}




















