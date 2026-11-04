import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class HelikopterCondet extends JPanel{
   public void paintComponent (Graphics g){
       g.drawOval(65, 150, 230, 130);
       
       g.fillOval(475, 130, 50, 50);
       
       int[] x = {295, 295, 520};
       int[] y = {180, 260, 180};
       g.fillPolygon(x,y, x.length);
       
       for (int i=0; i<2; i++){
           g.fillRect(160+i*30, 280, 20, 20);
       }
       
       int[] xp = {160, 160, 80};
       int[] yp = {225, 180, 225};
       g.fillPolygon(xp, yp, xp.length);
       
       g.fillRect(190, 180, 50, 50);
       
       g.drawRect(170, 120, 20, 30);
       g.drawRect(65, 100, 230, 20);
       
       g.fillRect(90, 300, 180, 20);
       
       int[] lx = {35, 60, 100, 90};
       int[] ly = {290, 270, 300, 320};
       g.fillPolygon(lx, ly, lx.length);
       
       int[] rx = {330, 305, 270, 270};
       int[] ry = {290, 270, 300, 320};
       g.fillPolygon(rx, ry, rx.length);
   }
   public static void main (String [] xx){
        JFrame f = new JFrame("HelikopterCondet");
        HelikopterCondet hc = new HelikopterCondet();
        f.getContentPane().add("Center",hc);
        f.pack();
        f.setSize(650, 500);
        f.setVisible(true);
    }
}