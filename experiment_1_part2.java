import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo {
    JButton jb = new JButton("Yes");
    JButton jb2 = new JButton("No");
    JButton jb3 = new JButton("Exit");
    JLabel label = new JLabel("Press a button");
    JFrame jt = new JFrame();

    ButtonDemo() {
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Yes button pressed");
            }
        });
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("No button pressed");
            }
        });
        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Exit button pressed");
            }
        });

        jt.add(label);
        jt.add(jb);
        jt.add(jb2);
        jt.add(jb3);
        jt.setSize(300, 300);
        jt.setLayout(new FlowLayout());
        jt.setVisible(true);
    }

    public static void main(String[] args) {
        ButtonDemo db = new ButtonDemo();
    }
}
