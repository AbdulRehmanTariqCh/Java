import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Type extends JFrame {
    private final JLabel q;
    private final JLabel w;
    private final JLabel E;
    private final JLabel r;
    private final JLabel t;
    private final JLabel y;
    private final JLabel u;
    private final JLabel I;
    private final JLabel o;
    private final JLabel p;
    private final JLabel a;
    private final JLabel s;
    private final JLabel d;
    private final JLabel f;
    private final JLabel G;
    private final JLabel h;
    private final JLabel j;
    private final JLabel k;
    private final JLabel l;
    private final JLabel z;
    private final JLabel X;
    private final JLabel c;
    private final JLabel v;
    private final JLabel b;
    private final JLabel n;
    private final JLabel m;
    private final JLabel space;
    private final JLabel text;
    private final JTextArea text2;
    private final JLabel one;
    private final JLabel two;
   private final JLabel three;
    private final JLabel four;
    private final JLabel five;
    private final JLabel six;
    private final JLabel seven;
    private final JLabel eight;
    private final JLabel nine;
    private final JLabel ten;
    private final JLabel eleven;
    private final JLabel twelve;
    private final JLabel thirteen;
    private final JLabel fourteen;
    private final JLabel fifteen;
    private final JLabel sixteen;
    private final JLabel seventeen;
    private final JLabel eighteen;
    private final JLabel nineteen;
    private final JLabel twenty;
    private final JLabel twentyone;
    private final JLabel twentytwo;
    public static int count;
 
    static{
        count=0;
    }

    void colour() {

        q.setBackground(Color.LIGHT_GRAY);
        w.setBackground(Color.LIGHT_GRAY);
        E.setBackground(Color.LIGHT_GRAY);
        r.setBackground(Color.LIGHT_GRAY);
        t.setBackground(Color.LIGHT_GRAY);
        y.setBackground(Color.LIGHT_GRAY);
        u.setBackground(Color.LIGHT_GRAY);
        I.setBackground(Color.LIGHT_GRAY);
        o.setBackground(Color.LIGHT_GRAY);
        p.setBackground(Color.LIGHT_GRAY);
        z.setBackground(Color.LIGHT_GRAY);
        a.setBackground(Color.LIGHT_GRAY);
        s.setBackground(Color.LIGHT_GRAY);
        d.setBackground(Color.LIGHT_GRAY);
        f.setBackground(Color.LIGHT_GRAY);
        G.setBackground(Color.LIGHT_GRAY);
        h.setBackground(Color.LIGHT_GRAY);
        j.setBackground(Color.LIGHT_GRAY);
        k.setBackground(Color.LIGHT_GRAY);
        l.setBackground(Color.LIGHT_GRAY);
        z.setBackground(Color.LIGHT_GRAY);
        X.setBackground(Color.LIGHT_GRAY);
        c.setBackground(Color.LIGHT_GRAY);
        v.setBackground(Color.LIGHT_GRAY);
        b.setBackground(Color.LIGHT_GRAY);
        n.setBackground(Color.LIGHT_GRAY);
        m.setBackground(Color.LIGHT_GRAY);
        space.setBackground(Color.LIGHT_GRAY);
        one.setBackground(Color.LIGHT_GRAY);
        two.setBackground(Color.LIGHT_GRAY);
        three.setBackground(Color.LIGHT_GRAY);
        four.setBackground(Color.LIGHT_GRAY);
        five.setBackground(Color.LIGHT_GRAY);
        six.setBackground(Color.LIGHT_GRAY);
        seven.setBackground(Color.LIGHT_GRAY);
        eight.setBackground(Color.LIGHT_GRAY);
        nine.setBackground(Color.LIGHT_GRAY);
        ten.setBackground(Color.LIGHT_GRAY);
        eleven.setBackground(Color.LIGHT_GRAY);
        twelve.setBackground(Color.LIGHT_GRAY);
        thirteen.setBackground(Color.LIGHT_GRAY);
    }

    public Type() {
        super("Typing tutor");

        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.fill = GridBagConstraints.HORIZONTAL;
        g.weightx = 1d;

        Color customColor = new Color(225, 250, 250);
        Color customColor3 = new Color(169, 169, 169);

        text = new JLabel("                                                      the quick brown fox jumps over the lazy dog               ");
        text.setFont(new Font("Ariel", Font.BOLD, 19));
        add(text, g);

        g.gridy = 1;   g.gridx = 0;
        q = new JLabel("q");
        q.setOpaque(true);
        q.setBackground(customColor3);
        q.setFont(new Font("Calibiri", Font.BOLD, 16));
        add(q, g);

        w = new JLabel("  w");
        w.setOpaque(true);
        w.setBackground(customColor3);
        w.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 1;
        add(w, g);

        E = new JLabel("  e");
        E.setOpaque(true);
        E.setBackground(customColor3);
        E.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 2;
        add(E, g);

        r = new JLabel("  r");
        r.setOpaque(true);
        r.setBackground(customColor3);
        r.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 3;
        add(r, g);

        t = new JLabel("  t");
        t.setOpaque(true);
        t.setBackground(customColor3);
        t.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 4;
        add(t, g);

        y = new JLabel("  y");
        y.setOpaque(true);
        y.setBackground(customColor3);
        y.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 5;
        add(y, g);

        u = new JLabel("  u");
        u.setOpaque(true);
        u.setBackground(customColor3);
        u.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 6;
        add(u, g);

        I = new JLabel("  i");
        I.setOpaque(true);
        I.setBackground(customColor3);
        I.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 7;
        add(I, g);

        o = new JLabel("  o");
        o.setOpaque(true);
        o.setBackground(customColor3);
        o.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 8;
        add(o, g);

        p = new JLabel("  p");
        p.setOpaque(true);
        p.setBackground(customColor3);
        p.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 9;
        add(p, g);

        a = new JLabel("a");
        a.setOpaque(true);
        a.setBackground(customColor3);
        a.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 0;
        g.gridy = 2;
        add(a, g);

        s = new JLabel("  s");
        s.setOpaque(true);
        s.setBackground(customColor3);
        s.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 1;
        add(s, g);

        d = new JLabel("  d");
        d.setOpaque(true);
        d.setBackground(customColor3);
        d.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 2;
        add(d, g);

        f = new JLabel("  f");
        f.setOpaque(true);
        f.setBackground(customColor3);
        f.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 3;
        add(f, g);

        G = new JLabel("  g");
        G.setOpaque(true);
        G.setBackground(customColor3);
        G.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 4;
        add(G, g);

        h = new JLabel("  h");
        h.setOpaque(true);
        h.setBackground(customColor3);
        h.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 5;
        add(h, g);

        j = new JLabel("  j");
        j.setOpaque(true);
        j.setBackground(customColor3);
        j.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 6;
        add(j, g);

        k = new JLabel("  k");
        k.setOpaque(true);
        k.setBackground(customColor3);
        k.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 7;
        add(k, g);

        l = new JLabel("  l");
        l.setOpaque(true);
        l.setBackground(customColor3);
        l.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 8;
        add(l, g);

        one=new JLabel("                ");
        one.setOpaque(true);
        one.setFont(new Font("Calibiri", Font.BOLD, 16));
        one.setBackground(customColor3);
        g.gridx=9;
        add(one,g);

        z = new JLabel("z");
        z.setOpaque(true);
        z.setBackground(customColor3);
        z.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 0;
        g.gridy = 4;
        add(z, g);

        X = new JLabel("  x");
        X.setOpaque(true);
        X.setBackground(customColor3);
        X.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 1;
        add(X, g);

        c = new JLabel("  c");
        c.setOpaque(true);
        c.setBackground(customColor3);
        c.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 2;
        add(c, g);

        v = new JLabel("  v");
        v.setOpaque(true);
        v.setBackground(customColor3);
        v.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 3;
        add(v, g);

        b = new JLabel("  b");
        b.setOpaque(true);
        b.setBackground(customColor3);
        b.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 4;
        add(b, g);

        n = new JLabel("  n");
        n.setOpaque(true);
        n.setBackground(customColor3);
        n.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 5;
        add(n, g);

        m = new JLabel("  m");
        m.setOpaque(true);
        m.setBackground(customColor3);
        m.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 6;
        add(m, g);

        two=new JLabel("   ");
        two.setOpaque(true);
        two.setFont(new Font("Calibiri", Font.BOLD, 16));
        two.setBackground(customColor3);
        g.gridx=7;
        add(two,g);

        three=new JLabel("   ");
        three.setOpaque(true);
        three.setFont(new Font("Calibiri", Font.BOLD, 16));
        three.setBackground(customColor3);
        g.gridx=8;
        add(three,g);

       four=new JLabel("   ");
        four.setOpaque(true);
        four.setFont(new Font("Calibiri", Font.BOLD, 16));
        four.setBackground(customColor3);
        g.gridx=9;
        add(four,g);

        space = new JLabel("                                                                                   SPACE     ");
        space.setOpaque(true);
        space.setBackground(customColor3);
        space.setFont(new Font("Calibiri", Font.BOLD, 16));
        g.gridx = 0;
        g.gridy = 8;
        add(space, g);

        five=new JLabel("   ");
        five.setOpaque(true);
        five.setFont(new Font("Calibiri", Font.BOLD, 16));
        five.setBackground(customColor3);
        g.gridx=1;
        add(five,g);

        six=new JLabel("   ");
        six.setOpaque(true);
        six.setFont(new Font("Calibiri", Font.BOLD, 16));
        six.setBackground(customColor3);
        g.gridx=2;
        add(six,g);

        seven=new JLabel("   ");
        seven.setOpaque(true);
        seven.setFont(new Font("Calibiri", Font.BOLD, 16));
        seven.setBackground(customColor3);
        g.gridx=3;
        add(seven,g);

        eight=new JLabel("   ");
        eight.setOpaque(true);
        eight.setFont(new Font("Calibiri", Font.BOLD, 16));
        eight.setBackground(customColor3);
        g.gridx=4;
        add(eight,g);

        nine=new JLabel("   ");
        nine.setOpaque(true);
        nine.setFont(new Font("Calibiri", Font.BOLD, 16));
        nine.setBackground(customColor3);
        g.gridx=5;
        add(nine,g);

        ten=new JLabel("   ");
        ten.setOpaque(true);
        ten.setFont(new Font("Calibiri", Font.BOLD, 16));
        ten.setBackground(customColor3);
        g.gridx=6;
        add(ten,g);

        eleven=new JLabel("   ");
        eleven.setOpaque(true);
        eleven.setFont(new Font("Calibiri", Font.BOLD, 16));
        eleven.setBackground(customColor3);
        g.gridx=7;
        add(eleven,g);

        twelve=new JLabel("   ");
        twelve.setOpaque(true);
        twelve.setFont(new Font("Calibiri", Font.BOLD, 16));
        twelve.setBackground(customColor3);
        g.gridx=8;
        add(twelve,g);

        thirteen=new JLabel("   ");
        thirteen.setOpaque(true);
        thirteen.setFont(new Font("Calibiri", Font.BOLD, 16));
        thirteen.setBackground(customColor3);
        g.gridx=9;
        add(thirteen,g);



        text2 = new JTextArea("          ");
        text2.setBackground(customColor);
        text2.setFont(new Font("Ariel", Font.BOLD, 16));
        g.gridx = 0;
        g.gridy = 9;
        add(text2, g);

        fourteen=new JLabel("   ");
        fourteen.setOpaque(true);
        fourteen.setFont(new Font("Calibiri", Font.BOLD, 16));
        fourteen.setBackground(customColor);
        g.gridx=1;
        add(fourteen,g);

        fifteen=new JLabel("   ");
        fifteen.setOpaque(true);
        fifteen.setFont(new Font("Calibiri", Font.BOLD, 16));
        fifteen.setBackground(customColor);
        g.gridx=2;
        add(fifteen,g);

        sixteen=new JLabel("   ");
        sixteen.setOpaque(true);
        sixteen.setFont(new Font("Calibiri", Font.BOLD, 16));
        sixteen.setBackground(customColor);
        g.gridx=3;
        add(sixteen,g);

        seventeen=new JLabel("   ");
        seventeen.setOpaque(true);
        seventeen.setFont(new Font("Calibiri", Font.BOLD, 16));
        seventeen.setBackground(customColor);
        g.gridx=4;
        add(seventeen,g);

        eighteen=new JLabel("   ");
        eighteen.setOpaque(true);
        eighteen.setFont(new Font("Calibiri", Font.BOLD, 16));
        eighteen.setBackground(customColor);
        g.gridx=5;
        add(eighteen,g);

        nineteen=new JLabel("   ");
        nineteen.setOpaque(true);
        nineteen.setFont(new Font("Calibiri", Font.BOLD, 16));
        nineteen.setBackground(customColor);
        g.gridx=6;
        add(nineteen,g);

        twenty=new JLabel("   ");
        twenty.setOpaque(true);
        twenty.setFont(new Font("Calibiri", Font.BOLD, 16));
        twenty.setBackground(customColor);
        g.gridx=7;
        add(twenty,g);

        twentyone=new JLabel("   ");
        twentyone.setOpaque(true);
        twentyone.setFont(new Font("Calibiri", Font.BOLD, 16));
        twentyone.setBackground(customColor);
        g.gridx=8;
        add(twentyone,g);

        twentytwo=new JLabel("   ");
        twentytwo.setOpaque(true);
        twentytwo.setFont(new Font("Calibiri", Font.BOLD, 16));
        twentytwo.setBackground(customColor);
        g.gridx=9;
        add(twentytwo,g);

        text2.getInputMap().put(KeyStroke.getKeyStroke("BACK_SPACE"), "none");
        text2.getInputMap().put(KeyStroke.getKeyStroke("UP"), "none");
        text2.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "none");
        text2.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "none");
        text2.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "none");

        KeyEventHandler k = new KeyEventHandler();
        text2.addKeyListener(k);
    }

    private class KeyEventHandler implements KeyListener {

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            colour();
            int key, score = 0;
            key = e.getKeyCode();

            if (count== 43) {
                if(score<0)
                    score=0;
                String sentence = "the quick brown fox jumps over the lazy dog";
                String store = text2.getText();

                for (int i = 0; i < Math.min(store.length(), sentence.length()); i++) {
                    if ((store.charAt(i) == sentence.charAt(i))) {
                        score++;
                    }
                }
                JOptionPane.showMessageDialog(null, String.format("Score: %d/43 ", score));
                System.exit(0);
            }



            if (key == KeyEvent.VK_Q&&count==4) {
                colour();
                q.setBackground(Color.yellow);
                count++;
            }

           else if (key == KeyEvent.VK_W&&count==13) {
                colour();
                w.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_E&&(count==2||count==28||count==33)) {
                colour();
                E.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_R&&(count==11||count==29)) {
                colour();
                r.setBackground(Color.yellow);
                count++;
            }


            else if (key == KeyEvent.VK_T&&(count==0||count==31)) {
                colour();
                t.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_Y&&count==38) {
                colour();
                y.setBackground(Color.yellow);
                count++;
            }


            else if (key == KeyEvent.VK_U&&(count==5||count==21)) {
                colour();
                u.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_I&&count==6) {
                colour();
                I.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_O&&(count==12||count==17||count==21||count==41||count==26)) {
                colour();
                o.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_P&&count==23) {
                colour();
                p.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_A&&(count==32||count==36)) {
                colour();
                a.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_S&&count==24) {
                colour();
                s.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_D&&count==40) {
                colour();
                d.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_F&&count==16) {
                colour();
                f.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_G&&count==42) {
                colour();
                G.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_H&&(count==32||count==1)) {
                colour();
                h.setBackground(Color.yellow);
                count++;
            }

            else  if (key == KeyEvent.VK_J&&count==20) {
                colour();
                j.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_K&&count==8) {
                colour();
                k.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_L&&count==35) {
                colour();
                l.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_Z&&count==37) {
                colour();
                z.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_X&&count==18) {
                colour();
                X.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_C&&count==7) {
                colour();
                c.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_V&&count==27) {
                colour();
                v.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_B&&count==10) {
                colour();
                b.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_N&&count==14) {
                colour();
                n.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_M&&(count==18||count==22)) {
                colour();
                m.setBackground(Color.yellow);
                count++;
            }

            else if (key == KeyEvent.VK_SPACE&&(count==3||count==9||count==15||count==19||count==25||count==30||count==34||count==39)) {
                colour();
                space.setBackground(Color.yellow);
                count++;
            }
            else{
                colour();
                if(key==KeyEvent.VK_Q)
                {
                    q.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_W)
                {
                    w.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_E)
                {
                    E.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_R)
                {
                    r.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_T)
                {
                    t.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_Y)
                {
                    y.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_U)
                {
                    u.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_I)
                {
                    I.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_O)
                {
                    o.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_P)
                {
                    p.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_A)
                {
                    a.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_S)
                {
                    s.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_D)
                {
                    d.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_F)
                {
                    f.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_G)
                {
                    G.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_H)
                {
                    h.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_J)
                {
                    j.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_K)
                {
                    k.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_L)
                {
                    l.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_Z)
                {
                    z.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_X)
                {
                    X.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_C)
                {
                    c.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_V)
                {
                    v.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_B)
                {
                    b.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_N)
                {
                    n.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_M)
                {
                    m.setBackground(Color.red);
                }
                else if(key==KeyEvent.VK_SPACE)
                {
                    space.setBackground(Color.red);
                }
                count++;
            }
        }
    }
}