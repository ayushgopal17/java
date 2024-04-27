interface member
{
public void callback();
}
class store
{
    member members[]=new member[10];
    int count=0;
    store()
    {
    }
    void register(member m) {
        members[count++]=m;
    }
    void invitesale()
    {
        for (int i=0;i<count;i++)
            members[i].callback();
    }
}
class customer implements member
{
    String name;
    customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("ok i will visit "+name);
    }
}
public class Main {

    public static void main(String[] args) {
        store s=new store();
        customer c=new customer("john");
        customer c2=new customer("smith");
                s.register(c);
        s.register(c2);
        s.invitesale();
    }
}
