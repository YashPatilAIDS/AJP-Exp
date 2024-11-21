import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseClicked extends JFrame {
    private JLabel l1 = new JLabel();

    MouseClicked() {
        l1.setBounds(50, 50, 200, 200);
        add(l1);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Graphics g = getGraphics();
                drawSmiley(g, me.getX(), me.getY());
                l1.setText("Mouse Clicked at X: " + me.getX() + ", Y: " + me.getY());
                System.out.println("Mouse Clicked at X: " + me.getX() + ", Y: " + me.getY());
            }
        });

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void drawSmiley(Graphics g, int x, int y) {
        g.setColor(Color.YELLOW);

        // Draw the face (a filled oval)
        g.fillOval(x - 25, y - 25, 50, 50);

        g.setColor(Color.BLACK);

        // Draw the eyes (two filled ovals)
        g.fillOval(x - 15, y - 15, 10, 10);
        g.fillOval(x + 5, y - 15, 10, 10);

        // Draw the mouth (a semi-circle)
        g.drawArc(x - 15, y - 5, 30, 20, 0, -180);
    }

    public static void main(String[] args) {
        new MouseClicked();
    }
}
