import java.awt.event.*;
import javax.swing.*;

public class exp6 extends JFrame implements ActionListener {
    JButton b1;
    JLabel l1, l2, l3, l4;
    JTextArea t;
    JPasswordField p;
    JButton b;
    String username, password;

    exp6() {
        l1 = new JLabel("Welcome! Please enter your details.");
        l2 = new JLabel("Username:");
        l3 = new JLabel("Password:");
        l4 = new JLabel();
        
        t = new JTextArea();
        p = new JPasswordField();
        b = new JButton("Sign in");
        
        try {
            setContentPane(new JLabel(new ImageIcon("D:\\Yash\\College\\pic3.jpg")));
        } catch (Exception e) {
            System.out.println("Image not found: " + e);
        }

        l1.setBounds(120, 80, 200, 30);
        l2.setBounds(120, 120, 100, 20);
        l3.setBounds(120, 160, 100, 20);
        l4.setBounds(150, 230, 200, 20);
        t.setBounds(200, 120, 120, 20);
        p.setBounds(200, 160, 120, 20);
        b.setBounds(170, 200, 100, 30);
        
        b.addActionListener(this);
        
        add(l1);
        add(l2);
        add(t);
        add(l3);
        add(p);
        add(b);
        add(l4);
        
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
    }

    public void actionPerformed(ActionEvent ae) {
        username = t.getText();
        password = new String(p.getPassword());
        
        if (username.equals("yourUsername") && password.equals("yourPassword")) {
            l4.setText("Login unsuccessful!!");
        } else {
            l4.setText("Login successful! Welcome, " + username + "!");
        }

        System.out.println("Account details:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        new exp6();
    }
}
