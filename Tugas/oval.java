import java.awt.Graphics;
import javax.swing.*;

public class oval extends JPanel{
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        int x = 10;
        int y = 10;
        for ( int i=0; i<6; i++){
            g.drawOval(x+i*10, y+i*20, 20, 20);
        }
    }
    public static void main (String [] xx){
        JFrame f = new JFrame("Latihan Oval");
        oval o = new oval();
        f.getContentPane().add("Center",o);
        f.pack();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}