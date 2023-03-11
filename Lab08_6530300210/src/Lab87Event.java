import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Lab87Event extends JFrame {
    private JTextField t;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private JRadioButton plain, bold, italic, boldItalic;
    private JCheckBox check1, check2;
    private int checkBoxHandle = 1;

    public Lab87Event() {
        super("RadioButton Test");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        t = new JTextField("Watch the font style change", 25);
        c.add(t);

        plain = new JRadioButton("Plain", true);
        bold = new JRadioButton("Bold", true);
        italic = new JRadioButton("Italic", true);
        boldItalic = new JRadioButton("Bold/Italic", true);
        c.add(plain);
        c.add(bold);
        c.add(italic);
        c.add(boldItalic);

        check1 = new JCheckBox("Confirm", true);
        check2 = new JCheckBox("Cancel");
        c.add(check1);
        c.add(check2);

        ButtonHandler handler = new ButtonHandler();
        plain.addItemListener(handler);
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        boldItalic.addItemListener(handler);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(plain);
        radioGroup.add(bold);
        radioGroup.add(italic);
        radioGroup.add(boldItalic);

        ButtonGroup checkboxGroup = new ButtonGroup();
        checkboxGroup.add(check1);
        checkboxGroup.add(check2);

        plainFont = new Font("TimeRoman", Font.PLAIN, 14);
        boldFont = new Font("TimeRoman", Font.BOLD, 14);
        italicFont = new Font("TimeRoman", Font.ITALIC, 14);
        boldItalicFont = new Font("TimeRoman", Font.BOLD | Font.ITALIC, 14);

        t.setFont(plainFont);

        check1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == e.SELECTED) {
                    System.out.println("selected");
                    checkBoxHandle = 1;
                } else
                    System.out.println("de-selected");
                System.out.println("Confirm\n");
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);

        check2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == e.SELECTED) {
                    System.out.println("selected");
                    checkBoxHandle = 0;
                } else
                    System.out.println("de-selected");
                System.out.println("Cancel\n");

            }
        });

    }

    public static void main(String[] args) {
        new Lab87Event();
    }

    class ButtonHandler implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (e.getSource() == plain)
                        t.setFont(plainFont);
                    else if (e.getSource() == bold)
                        t.setFont(boldFont);
                    else if (e.getSource() == italic)
                        t.setFont(italicFont);
                    else if (e.getSource() == boldItalic)
                        t.setFont(boldItalicFont);
                }
                t.repaint();
            }
        }
    }

}