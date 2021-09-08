package Assignement10_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Flow;

public class q6 extends Frame implements ActionListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private TextField t1,t2,t3;
    private String s1 = null;
    private String s2 = null;
    private int c = 0;

    private q6() {
        setLayout(null);
        t1 = new TextField();
        t1.setLocation(20, 50);
        t1.setSize(160, 50);
        add(t1);
        t2 = new TextField();
        t2.setLocation(200, 50);
        t2.setSize(160, 50);
        add(t2);
        b1 = new Button("ADD");
        b1.setLocation(20, 120);
        b1.setSize(75, 75);
        add(b1);
        b2 = new Button("SUB");
        b2.setLocation(115, 120);
        b2.setSize(75, 75);
        add(b2);
        t3 = new TextField();
        t3.setLocation(200, 300);
        t3.setSize(160, 50);
        add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t3.setText(String.valueOf(Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText())));
        }
        if (e.getSource() == b2) {
            t3.setText(String.valueOf(Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText())));
        }
    }

    public void paint(Graphics g) {

    }

    public static void main(String[] args) {
        q6 b = new q6();
        b.setVisible(true);
        b.setSize(400, 500);
        b.setLocation(150, 70);
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