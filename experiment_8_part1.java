import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends Frame implements ActionListener {
    
    public MyFrame() {
        setTitle("My Frame");  
        
        setSize(400, 300);        
        JButton button = new JButton("Close Window");     
        setLayout(null); 
        button.setBounds(100, 100, 200, 50); 
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Window is closing");
                System.exit(0);
            }
        });
        
        add(button);       
       
        addWindowListener(new MyWindowAdapter());
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Inner class to handle window events
    class MyWindowAdapter extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Window is closing");
            System.exit(0);
        }
    }
}
