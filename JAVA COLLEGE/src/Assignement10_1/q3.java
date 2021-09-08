package Assignement10_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Flow;

public class q3 extends Frame implements ActionListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private TextField t1,t2,t3;
    private String s1 = null;
    private String s2 = null;
    private Label l1;
    private Checkbox c1;
    private int c = 0;

    private q3() {
        setLayout(null);
        t1 = new TextField();
        t1.setLocation(20, 50);
        t1.setSize(350, 50);
        add(t1);
        b1 = new Button("RED");
        b1.setLocation(20, 120);
        b1.setSize(75, 75);
        add(b1);
        l1=new Label("Correct");
        l1.setLocation(20, 220);
        l1.setSize(75, 75);
        add(l1);
        c1=new Checkbox();
        c1.setLocation(120, 220);
        c1.setSize(10, 10);
        add(c1);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public void paint(Graphics g) {

    }

    public static void main(String[] args) {
        q3 b = new q3();
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