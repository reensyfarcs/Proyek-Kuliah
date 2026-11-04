import java.awt.*;
import javax.swing.*;
public class latihanp4 extends JPanel{
    public void paintComponent (Graphics g){
        super.paintComponent (g);
        
        //BG
        g.setColor(Color.BLACK);
        g.fillRect(20,20, 110, 260);
        
        
        //elips
        g.setColor(Color.RED);
        g.fillOval(40, 40, 70, 50);
        
        g.setColor(Color.YELLOW);
        g.fillOval(40, 120, 70, 50);
        
        g.setColor(Color.GREEN);
        g.fillOval(40, 200, 70, 50);
        
        //rect
        g.setColor(Color.GRAY);
        g.fillRect(60, 280, 30, 100);
    }
    
    public static void main (String[] xx){
        JFrame f = new JFrame("TUGAS 4");
        latihanp4 p = new latihanp4();
        
        f.add(p);
        f.setSize(350, 550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}