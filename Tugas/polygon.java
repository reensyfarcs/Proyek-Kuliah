import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class polygon extends JPanel{
    public void paintComponent (Graphics g){
        
        g.setColor(Color.BLACK);
        g.fillRoundRect(10,20,170,70,20,20);
        
        g.setColor(Color.YELLOW);
        g.fillOval(20,40,30,30);
        
        g.setColor(Color.BLUE);
        g.fillRect(100,40,30,30);
        
        for(int i=0; i<2; i++){
            Color c [] = {Color.GREEN, Color.RED};
            g.setColor (c[i]);
            int x [] = {60+i*80,75+i*80,90+i*80};
            int y [] = {50,30,50};
            int pts = x.length;
            g.fillPolygon(x, y, pts);
        }
        
        for(int j=0; j<2; j++){
            Color w [] = {Color.RED, Color.YELLOW};
            g.setColor (w[j]);
            int x1 [] = {60+j*80,75+j*80,90+j*80};
            int y1 [] = {60,80,60};
            int pts = x1.length;
            g.fillPolygon(x1, y1, pts);
        }
    }
    public static void main (String [] xx){
        JFrame f = new JFrame("Latihan Tic Tac Toe");
        polygon p = new polygon();
        f.getContentPane().add("Center",p);
        f.pack();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}