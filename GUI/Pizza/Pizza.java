import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pizza extends JFrame {
    private final JLabel head1;
    private final JLabel head2;
    private final JRadioButton smallButton;
    private final JRadioButton medButton;
    private final JRadioButton largeButton;
    private final JCheckBox cheese;
    private final JCheckBox pepperoni;
    private final JCheckBox olives;
    private final JLabel Total;

    public Pizza() {
        super("Pizza menu");
        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.fill = GridBagConstraints.HORIZONTAL;

        head1 = new JLabel("SELECT SIZE");
        head2 = new JLabel("ADD TOPPINGS");
        head1.setFont(new Font("Maiandra GD", Font.BOLD, 12));
        head2.setFont(new Font("Maiandra GD", Font.BOLD, 12));


        smallButton = new JRadioButton("Small");
        medButton = new JRadioButton("Medium");
        largeButton = new JRadioButton("Large");

        ButtonGroup b = new ButtonGroup();

        g.gridx = 0;
        g.gridy = 0;
        add(head1, g);
        b.add(smallButton);
        b.add(medButton);
        b.add(largeButton);
        g.gridx = 0;
        g.gridy = 1;
        add(smallButton, g);
        g.gridx = 0;
        g.gridy = 2;
        add(medButton, g);
        g.gridx = 0;
        g.gridy = 3;
        add(largeButton, g);

        g.gridx = 0;
        g.gridy = 5;
        add(head2, g);
        cheese = new JCheckBox("Cheese");
        pepperoni = new JCheckBox("pepperoni");
        olives = new JCheckBox("Olives");
        g.gridx = 0;
        g.gridy = 6;
        add(cheese, g);
        g.gridx = 0;
        g.gridy = 7;
        add(pepperoni, g);
        g.gridx = 0;
        g.gridy = 8;
        add(olives, g);

        Total = new JLabel("Grand total: Rs.0");

        g.gridx = 0;
        g.gridy = 9;
        add(Total, g);

        EventsHandler handler = new EventsHandler();
        smallButton.addItemListener(handler);
        medButton.addItemListener(handler);
        largeButton.addItemListener(handler);
        olives.addItemListener(handler);
        cheese.addItemListener(handler);
        pepperoni.addItemListener(handler);
    }

    private class EventsHandler implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            int total = 0;
            {
                if (smallButton.isSelected()) {
                    total += 500;
                } else if (medButton.isSelected()) {
                    total += 750;
                } else if (largeButton.isSelected()) {
                    total += 1000;
                } else {
                    Total.setText(String.valueOf(String.format("Grand Total: Rs.%d", total)));
                }
            }
            if (olives.isSelected()) {
                total += 50;
            }
            if (pepperoni.isSelected()) {
                total += 100;
            }
            if (cheese.isSelected()) {
                total += 150;
            }

            Total.setText(String.valueOf(String.format("Grand Total: Rs.%d", total)));
        }
    }
}