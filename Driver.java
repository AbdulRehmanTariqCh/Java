import javax.swing.*;
import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        Type t=new Type();
        t.setSize(1100,400);
        t.getContentPane().setBackground(Color.white);
        t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        t.setVisible(true);
    }
}