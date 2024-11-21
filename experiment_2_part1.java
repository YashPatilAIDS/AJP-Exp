import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Largest extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextArea t1, t2, t3;
    JButton b;

    Largest() {
        l1 = new JLabel("Enter 1st number");
        l2 = new JLabel("Enter 2nd number: ");
        l3 = new JLabel("Largest number = ");
        l4 = new JLabel("Click here after entering");
        t1 = new JTextArea();
        t2 = new JTextArea();
        t3 = new JTextArea();
        b = new JButton("Largest");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(b);

        b.addActionListener(this);
        setSize(600, 600);
        setLayout(new GridLayout(4, 2));
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            String n1 = t1.getText();
            String n2 = t2.getText();
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);

            if (num1 > num2) {
                t3.setText("Number 1 is largest");
            } else if (num1 == num2) {
                t3.setText("Numbers are equal");
            } else {
                t3.setText("Number 2 is largest");
            }
        }
    }

    public static void main(String[] args) {
        new Largest();
    }
}
