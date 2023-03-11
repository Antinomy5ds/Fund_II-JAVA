import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Lab86Event extends JFrame {
    private JTextField textField1;

    public Lab86Event() {
        super("Application");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        Font font1 = new Font("Courier New", Font.BOLD, 20);
        JLabel label1 = new JLabel("Enter you name:");
        label1.setFont(font1);
        textField1 = new JTextField(25);
        textField1.setFont(font1);

        c.add(label1, BorderLayout.CENTER);
        c.add(textField1, BorderLayout.CENTER);

        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You entered " + textField1.getText());
                textField1.setText(null);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 360);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab86Event();
    }
}
