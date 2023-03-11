package HW;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Swap {
    public static void main(String[] args) {
        Font font = new Font("Cloud", Font.BOLD, 20);
        JTextField text1 = new JTextField("", 25);
        JTextField text2 = new JTextField("", 25);
        JCheckBox check1 = new JCheckBox("Swap");
        JCheckBox check2 = new JCheckBox("Modify on Swap");
        JLabel label = new JLabel("Output here", SwingConstants.CENTER);
        JButton btn1 = new JButton("Submit");
        JButton btn2 = new JButton("Clear");

        //
        JFrame frame = new JFrame("Swap Test");
        frame.setSize(480, 360);
        frame.setBackground(Color.gray);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        //
        label.setFont(font);
        label.setForeground(Color.white);
        label.setPreferredSize(new Dimension(480, 60));

        //
        JPanel panel = new JPanel();
        panel.add(label);
        panel.setBackground(Color.gray);
        //
        text1.setFont(font);
        panel.add(text1);
        text2.setFont(font);
        panel.add(text2);
        //
        panel.add(btn1);
        panel.add(btn2);

        //
        check1.setBackground(Color.gray);
        check1.setForeground(Color.white);
        panel.add(check1);
        check2.setBackground(Color.gray);
        check2.setForeground(Color.white);
        panel.add(check2);

        frame.add(panel);

        // Clear
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text2.setText("");
                label.setText("");
            }

        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(text1.getText() + " " + text2.getText());
            }
        });

        check1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (check1.isSelected() && check2.isSelected()) {
                    String temp = text1.getText();
                    text1.setText(text2.getText());
                    text2.setText(temp);
                    label.setText(text1.getText() + " " + text2.getText());
                } else if (check1.isSelected()) {
                    label.setText(text2.getText() + " " + text1.getText());
                } else {
                    label.setText("");
                }
            }
        });

    }
}
