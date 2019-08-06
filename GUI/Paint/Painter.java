import javax.swing.*;
import java.awt.*;

public class Painter {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        Paint p=new Paint();
        f.add( p, BorderLayout.CENTER );
        f.add( new JLabel( "Drag the mouse to draw" ),
        BorderLayout.SOUTH );
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 400, 200 );
        f.setVisible( true );
         }
}
