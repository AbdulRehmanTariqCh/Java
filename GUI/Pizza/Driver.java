import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        Pizza p=new Pizza();
        p.setSize(350,400);
        p.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        p.setVisible(true);
    }
}
