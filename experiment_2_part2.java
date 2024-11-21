import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextArea t1, t2;
    JButton b;

    Square() {
        l1 = new JLabel("Enter number");
        l2 = new JLabel("Square of number: ");
        l3 = new JLabel("Click here after entering");
        t1 = new JTextArea();
        t2 = new JTextArea();
        b = new JButton("Square");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(b);

        b.addActionListener(this);
        setSize(600, 600);
        setLayout(new GridLayout(3, 2));
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            String n1 = t1.getText();
            int num1 = Integer.parseInt(n1);
            int num2 = num1 * num1;
            t2.setText(String.valueOf(num2));
        }
    }

    public static void main(String[] args) {
        new Square();
    }
}
