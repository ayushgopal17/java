

import java.awt.*;
public class Awt {
    public static void main(String[] args) {
        Frame f=new Frame("my first app");
        f.setLayout(new FlowLayout());
        Button b= new Button("OK");
        Label l=new Label("Name ");
        TextField tf=new TextField(20);


        f.add(l);
        f.add(tf);
        f.add(b);
        f.setSize(300,300);
        f.setVisible(true);

    }
}
