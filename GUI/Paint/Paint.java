import javax.swing.JPanel;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Paint extends JPanel{
    private int pointCount;
    private Point points[]=new Point[1000];

    public Paint (){
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(pointCount<points.length)
                {
                    points[pointCount]=e.getPoint();
                    pointCount++;
                    repaint();
                }
            }
        });
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < pointCount; i++) {
            g.fillOval(points[i].x, points[i].y, 4, 4);
        }}}