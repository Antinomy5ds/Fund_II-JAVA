import java.awt.*;

import javax.swing.*;

public class Lab84Component {
    public static void main(String[] args) {
        Font font1 = new Font("Courier New", Font.BOLD, 20);
        JFrame frame = new JFrame("Account");
        frame.setSize(480, 360);

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JLabel label1 = new JLabel("Account Login", SwingConstants.CENTER);
        label1.setFont(font1);
        label1.setPreferredSize(new Dimension(480, 80));
        label1.setForeground(Color.white);

        JTextField text1 = new JTextField("Username", 30);
        text1.setFont(font1);

        JPasswordField pass1 = new JPasswordField("12345", 30);
        pass1.setFont(font1);

        JCheckBox checkBox1 = new JCheckBox("Member");
        checkBox1.setFont(font1);
        checkBox1.setBackground(Color.darkGray);
        checkBox1.setForeground(Color.white);

        JCheckBox checkBox2 = new JCheckBox("Non-Member");
        checkBox2.setFont(font1);
        checkBox2.setBackground(Color.darkGray);
        checkBox2.setForeground(Color.white);

        JButton btn1 = new JButton("Login");
        btn1.setFont(font1);
        btn1.setPreferredSize(new Dimension(370, 30));
        panel.add(label1);
        panel.add(text1);
        panel.add(pass1);

        panel.add(checkBox1);

        panel.add(checkBox2);
        panel.add(btn1);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
}
