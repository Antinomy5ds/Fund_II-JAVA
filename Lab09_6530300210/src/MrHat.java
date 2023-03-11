import java.awt.*;
import javax.swing.*;

public class MrHat extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(70, 70, 200, 200);

        g.setColor(Color.black);
        g.fillOval(115, 125, 30, 30);
        g.fillOval(195, 125, 30, 30);

        g.fillOval(110, 170, 120, 60);

        g.setColor(Color.yellow);
        g.fillRect(110, 170, 120, 30);
        g.fillOval(110, 180, 120, 40);

        g.setColor(Color.black);
        g.fillOval(68, 70, 200, 50);
        g.fillRect(120, 10, 100, 100);

        g.setColor(Color.black);
        g.fillRect(150, 200, 40, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mr.Hat");
        MrHat draw = new MrHat();

        frame.add(draw);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
