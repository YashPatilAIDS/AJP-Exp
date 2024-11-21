import javax.swing.*;
import java.awt.event.*;

public class MouseDemo extends JFrame implements MouseListener, MouseMotionListener {
    JLabel l1 = new JLabel();

    MouseDemo() {
        l1.setBounds(50, 50, 200, 200);
        add(l1);
        addMouseListener(this);
        addMouseMotionListener(this);  // Add MouseMotionListener

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent me) {
        l1.setText("Mouse is clicked");
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        l1.setText("Mouse is entered");
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        l1.setText("Mouse is exited");
        System.out.println("Mouse Exited");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        l1.setText("Mouse is pressed");
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        l1.setText("Mouse is released");
        System.out.println("Mouse Released");
    }

    // MouseMotionListener methods
    @Override
    public void mouseMoved(MouseEvent me) {
        l1.setText("Mouse is moving at X: " + me.getX() + ", Y: " + me.getY());
        System.out.println("Mouse Moved");
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        l1.setText("Mouse is dragging at X: " + me.getX() + ", Y: " + me.getY());
        System.out.println("Mouse Dragged");
    }

    public static void main(String[] args) {
        new MouseDemo();
    }
}
