import javax.swing.*;
import java.awt.*;

public class Driver {

    public static void main(String args[])
    {
        LoginSystem ls = new LoginSystem("Login");
        ls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ls.setSize(250,120);
        ls.setVisible(true);
    }
}