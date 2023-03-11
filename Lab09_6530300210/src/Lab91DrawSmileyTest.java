import javax.swing.*;

public class Lab91DrawSmileyTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Smile");

        Lab91DrawSmiley draw = new Lab91DrawSmiley();

        frame.add(draw);
        frame.setSize(480, 360);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
