import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class Lines extends JPanel{
    public static void main (String[] xx){
        JFrame f = new JFrame("Lines");
        Lines bs = new Lines();
        f.getContentPane().add("Center",bs);
        f.pack();
        f.setSize(new Dimension(500, 500));
        f.setVisible(true);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //cast graphics to graphics 2D
        Graphics2D g2d = (Graphics2D) g;
        
        //garis vertikal membentuk X
        g2d.drawLine(50, 50, 100, 100);
        g2d.drawLine(100, 50, 50, 100);
        
        //garis horizontal membentuk =
        g2d.drawLine(150, 50, 200, 50);
        g2d.drawLine(150, 70, 200, 70);
        
        //kotak sejajar menggunakan drawRect()
        int x = 50, y = 150, size = 40;
        for (int i = 0; i < 5; i++){
            g2d.drawRect(x + i * (size + 10), y, size, size);
        }
    }
}