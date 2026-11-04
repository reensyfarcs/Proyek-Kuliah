import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class rr extends JPanel{
    public void paintComponent (Graphics g){
        
        g.setColor(Color.RED);
        for (int i=0; i<3;i++){
        g.fillOval(40+i*40, 40+i*40, 40, 40);
        }
        
        g.setColor(Color.BLUE);
        g.fillRoundRect(80,40,40,40,10,10);
        g.fillRoundRect(80,120,40,40,10,10);
        
        g.setColor(Color.BLACK);
        g.drawRoundRect(40,40,120,120,10,10);
        
        g.drawLine(120,40,120,160);
        g.drawLine(80,40,80,160);
        g.drawLine(40,80,160,80);
        g.drawLine(40,120,160,120);
        
        g.drawString("Tic Tac Toe", 60, 180);
    }
    public static void main (String [] xx){
        JFrame f = new JFrame("Latihan Tic Tac Toe");
        rr o = new rr();
        f.getContentPane().add("Center",o);
        f.pack();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}