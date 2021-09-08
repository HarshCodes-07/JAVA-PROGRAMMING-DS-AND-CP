package Assignement10_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.applet.*;
import java.util.concurrent.Flow;

public class q2 extends Frame implements ActionListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private TextField t1;
    private String s1 = null;
    private String s2 = null;
    private int c = 0;
    int x = 150, y = 50, r = 20;
    int dx = 11, dy = 7;


    private q2() {
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void paint(Graphics g) {
        g.fillArc(100,100,300,300,0,360);
        g.setColor(Color.BLACK);
        g.fillArc(160,150,40,40,0,360);
        g.setColor(Color.BLACK);
        g.fillArc(280,150,40,40,0,360);
        g.setColor(Color.BLACK);
        g.drawLine(200,350,300,350);
    }

    public static void main(String[] args) {
        q2 b = new q2();
        b.setVisible(true);
        b.setSize(1000, 700);
        b.setLocation(0, 0);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.YELLOW);
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