import java.awt.Graphics;
import javax.swing.*;

public class LatihanOvalArc extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 1. Elips vertikal
        g.drawOval(50, 50, 60, 120);  // width lebih kecil dari height

        // 2. Bulan sabit (arc)
        
        g.drawArc(150, 50, 100, 100, 135, 180);  // seperti huruf C
        g.fillArc(300, 50, 100, 100, 135, 180);  // versi filled

        // 3. 6 oval diagonal (anak tangga)
        int x = 50, y = 200;
        for (int i = 0; i < 6; i++) {
            g.drawOval(x, y, 60, 40);
            x += 40; // geser ke kanan
            y += 40; // geser ke bawah
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Latihan Oval dan Arc");
        LatihanOvalArc p = new LatihanOvalArc();

        f.add(p);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}