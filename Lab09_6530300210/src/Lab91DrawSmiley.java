import java.awt.*;
import javax.swing.*;

public class Lab91DrawSmiley extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        g.setColor(Color.black);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        g.fillOval(50, 110, 120, 60);

        g.setColor(Color.yellow);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}