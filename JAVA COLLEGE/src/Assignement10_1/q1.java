package Assignement10_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.applet.*;
import java.util.concurrent.Flow;

public class q1 extends Frame implements ActionListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private TextField t1;
    private String s1 = null;
    private String s2 = null;
    private int c = 0;
    int x = 150, y = 50, r = 20;
    int dx = 11, dy = 7;


    private q1() {
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void paint(Graphics g) {
        g.drawString("USER INFORMATION",50,50);
        g.drawString("NAME : HARSH DWIVEDI",50,100);
        g.drawString("ROLL : 1905607",50,130);
        g.drawString("BRANCH : CSE",50,160);
    }

    public static void main(String[] args) {
        q1 b = new q1();
        b.setVisible(true);
        b.setSize(1000, 700);
        b.setLocation(0, 0);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
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