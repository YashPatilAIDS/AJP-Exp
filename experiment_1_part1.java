import javax.swing.*;
import java.awt.event.*;

public class ButtonEvent extends JFrame implements KeyListener {
    JLabel jl;
    JTextArea jt;

    ButtonEvent() {
        jl = new JLabel();
        jt = new JTextArea();
        jl.setBounds(100, 60, 300, 20);
        jt.setBounds(100, 100, 300, 200);
        add(jt);
        add(jl);
        jt.addKeyListener(this);
        setSize(600, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        jl.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        jl.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        jl.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        ButtonEvent be = new ButtonEvent();
    }
}
