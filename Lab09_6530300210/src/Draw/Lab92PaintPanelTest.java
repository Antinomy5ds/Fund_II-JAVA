package Draw;

import java.awt.*;
import javax.swing.*;

public class Lab92PaintPanelTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Paint Panel");
        Lab92PaintPanel paint = new Lab92PaintPanel();
        JLabel label = new JLabel("Drag the mouse to draw", SwingConstants.CENTER);
        frame.add(label, BorderLayout.SOUTH);
        frame.add(paint);
        frame.setSize(480, 360);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
