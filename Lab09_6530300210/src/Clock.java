import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clock extends JPanel {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Get current time
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        // Set the center of the clock
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Set the radius of the clock
        int radius = Math.min(centerX, centerY) - 2;

        // Draw the circle
        g.setColor(Color.WHITE);
        g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
        g.setColor(Color.BLACK);
        g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

        // Draw the hour lines
        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30);
            int x1 = (int) (centerX + (radius - 30) * Math.sin(angle));
            int y1 = (int) (centerY - (radius - 30) * Math.cos(angle));
            int x2 = (int) (centerX + (radius - 10) * Math.sin(angle));
            int y2 = (int) (centerY - (radius - 10) * Math.cos(angle));
            g.drawLine(x1, y1, x2, y2);
        }

        // Draw the minute line
        double minuteAngle = Math.toRadians(minute * 6);
        int minuteLineX = (int) (centerX + (radius - 40) * Math.sin(minuteAngle));
        int minuteLineY = (int) (centerY - (radius - 40) * Math.cos(minuteAngle));
        g.setColor(Color.RED);
        g.drawLine(centerX, centerY, minuteLineX, minuteLineY);

        // Draw the second line
        double secondAngle = Math.toRadians(second * 6);
        int secondLineX = (int) (centerX + (radius - 20) * Math.sin(secondAngle));
        int secondLineY = (int) (centerY - (radius - 20) * Math.cos(secondAngle));
        g.setColor(Color.BLUE);
        g.drawLine(centerX, centerY, secondLineX, secondLineY);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        Clock clock = new Clock();
        frame.add(clock);
        frame.setVisible(true);

        // Schedule a task to repaint the clock every second
        TimerTask task = new TimerTask() {
            public void run() {
                clock.repaint();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);
    }
}
