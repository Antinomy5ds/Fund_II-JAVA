package HW;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClearText {

    public ClearText() {
        Font font1 = new Font("Cloud", Font.BOLD, 18);
        JFrame frame = new JFrame("Clear Text");
        frame.setSize(480, 360);
        frame.setBackground(Color.CYAN);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Clear Text Test", SwingConstants.CENTER);
        panel.setBackground(Color.gray);

        label.setFont(font1);
        label.setPreferredSize(new Dimension(480, 80));
        label.setForeground(Color.white);

        panel.add(label);

        frame.add(panel);

        JTextField textField = new JTextField("", 20);
        textField.setFont(font1);
        panel.add(textField);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Clear Text");
        btn.setPreferredSize(new Dimension(370, 30));
        panel.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }

        });
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });

    }

    public static void main(String[] args) {
        new ClearText();

    }
}
