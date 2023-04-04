import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPage extends JFrame implements ActionListener {
    JButton logout;
    IDandPass ac = new IDandPass();
    AdminPass adAc = new AdminPass();
    JLabel welcome = new JLabel("Welcome Admin");
    JPanel bar = new JPanel();
    ImageIcon logoutBtn = new ImageIcon("D:\\Project\\download.png");
    ImageIcon scale = new ImageIcon(logoutBtn.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
    Font headFont = new Font("Cloud", Font.BOLD, 20);

    AdminPage() {
        logout = new JButton("Logout", scale);
        logout.setFocusable(false);
        logout.setFont(headFont);
        logout.setBounds(932, 0, 50, 50);
        bar.setBounds(100, 100, 10, 10);
        welcome.setForeground(Color.yellow);

        bar.setBackground(Color.black);
        // frame
        setTitle("Gym Manager");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1000, 600);
        setLocation(200, 200);
        add(logout);
        add(bar);

        logout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout) {
            dispose();
            Login mainPage = new Login(ac.getAccountInfo(), adAc.getAdmin());
            System.out.println("It back");
        }
    }

    public static void main(String[] args) {
        new AdminPage();
    }

}
