import javax.swing.*;
import java.awt.event.*;

public class CheckBoxDemo extends JFrame implements ItemListener {
    
    JLabel l1 = new JLabel();
    JCheckBox j1 = new JCheckBox("C++");
    JCheckBox j2 = new JCheckBox("Java");
    JCheckBox j3 = new JCheckBox("C");
    
    CheckBoxDemo() {
        l1.setBounds(50, 150, 200, 30);
        add(l1);
        j1.setBounds(50, 50, 100, 30);
        add(j1);
        j2.setBounds(50, 80, 100, 30);
        add(j2);
        j3.setBounds(50, 110, 100, 30);
        add(j3);
        
        j1.addItemListener(this);
        j2.addItemListener(this);
        j3.addItemListener(this);
        
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application on exit
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == j1) {
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                l1.setText("C++ IS SELECTED");
            } else {
                l1.setText("C++ IS NOT SELECTED");
            }
        }
        if (ie.getSource() == j2) {
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                l1.setText("JAVA IS SELECTED");
            } else {
                l1.setText("JAVA IS NOT SELECTED");
            }
        }
        if (ie.getSource() == j3) {
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                l1.setText("C IS SELECTED");
            } else {
                l1.setText("C IS NOT SELECTED");
            }
        }
    }
    
    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
