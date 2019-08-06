import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginSystem extends JFrame{
    private final JTextField username;
    private final JPasswordField password;
    private final JLabel usernameLabel;
    private final JLabel passwordLabel;

    public LoginSystem(String text)
    {
        super(text);
        setLayout(new FlowLayout());

        username = new JTextField(10);
        password = new JPasswordField(10);
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");

        add(usernameLabel);
        add(username);
        add(passwordLabel);
        add(password);

        EventsHandler handler = new EventsHandler();
        username.addActionListener(handler);
        password.addActionListener(handler);
    }
    private class EventsHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (username.getText().equals("ABC"))        //hardcoded username
            {
                String pass = new String(password.getPassword());
                if (pass.equals("1234"))                         //hardcoded password
                {
                    JOptionPane.showMessageDialog(null, "Correct Password and Username!");
                    return;
                }
                JOptionPane.showMessageDialog(null, "Incorrect Password!");
                return;
            }
            JOptionPane.showMessageDialog(null, "Incorrect Username!");
        }}
}