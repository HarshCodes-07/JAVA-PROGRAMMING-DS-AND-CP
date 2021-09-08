package Assignement10_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Flow;

public class q5 extends Frame implements ActionListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private TextField t1, t2, t3;
    private String s1 = null;
    private String s2 = null;
    private Label l1;
    private Checkbox c1;
    private int c = 0;

    private q5() {
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void paint(Graphics g) {
        g.drawRect(40,40,100,200);
        g.drawRoundRect(120,120,100,200,30,100);
    }

    public static void main(String[] args) {
        q5 b = new q5();
        b.setVisible(true);
        b.setSize(1000, 700);
        b.setLocation(0, 0);
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.BLACK);
        Font f = new Font("Times New Roman", Font.ITALIC, 20);
        b.setFont(f);
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        b.setCursor(c);
        b.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}