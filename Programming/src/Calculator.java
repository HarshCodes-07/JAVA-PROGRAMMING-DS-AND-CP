import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Flow;

public class Calculator extends Frame implements ActionListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private TextField t1;
    private String s1 = null;
    private String s2 = null;
    private int c = 0;

    private Calculator() {
        setLayout(null);
        t1 = new TextField();
        t1.setLocation(20, 50);
        t1.setSize(350, 50);
        add(t1);
        b1 = new Button("7");
        b1.setLocation(20, 120);
        b1.setSize(75, 75);
        add(b1);
        b2 = new Button("8");
        b2.setLocation(115, 120);
        b2.setSize(75, 75);
        add(b2);
        b3 = new Button("9");
        b3.setLocation(205, 120);
        b3.setSize(75, 75);
        add(b3);
        b4 = new Button("%");
        b4.setLocation(295, 120);
        b4.setSize(75, 75);
        add(b4);


        b5 = new Button("4");
        b5.setLocation(20, 215);
        b5.setSize(75, 75);
        add(b5);
        b6 = new Button("5");
        b6.setLocation(115, 215);
        b6.setSize(75, 75);
        add(b6);
        b7 = new Button("6");
        b7.setLocation(205, 215);
        b7.setSize(75, 75);
        add(b7);
        b8 = new Button("X");
        b8.setLocation(295, 215);
        b8.setSize(75, 75);
        add(b8);


        b9 = new Button("1");
        b9.setLocation(20, 310);
        b9.setSize(75, 75);
        add(b9);
        b10 = new Button("2");
        b10.setLocation(115, 310);
        b10.setSize(75, 75);
        add(b10);
        b11 = new Button("3");
        b11.setLocation(205, 310);
        b11.setSize(75, 75);
        add(b11);
        b12 = new Button("+");
        b12.setLocation(295, 310);
        b12.setSize(75, 75);
        add(b12);


        b13 = new Button("-");
        b13.setLocation(20, 405);
        b13.setSize(75, 75);
        add(b13);
        b14 = new Button("0");
        b14.setLocation(115, 405);
        b14.setSize(75, 75);
        add(b14);
        b15 = new Button("/");
        b15.setLocation(205, 405);
        b15.setSize(75, 75);
        add(b15);
        b16 = new Button("=");
        b16.setLocation(295, 405);
        b16.setSize(75, 75);
        add(b16);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t1.setText(t1.getText() + b1.getLabel());
        }
        if (e.getSource() == b2) {
            t1.setText(t1.getText() + b2.getLabel());
        }
        if (e.getSource() == b3) {
            t1.setText(t1.getText() + b3.getLabel());
        }
        if (e.getSource() == b5) {
            t1.setText(t1.getText() + b5.getLabel());
        }
        if (e.getSource() == b6) {
            t1.setText(t1.getText() + b6.getLabel());
        }
        if (e.getSource() == b7) {
            t1.setText(t1.getText() + b7.getLabel());
        }
        if (e.getSource() == b9) {
            t1.setText(t1.getText() + b9.getLabel());
        }
        if (e.getSource() == b10) {
            t1.setText(t1.getText() + b10.getLabel());
        }
        if (e.getSource() == b11) {
            t1.setText(t1.getText() + b11.getLabel());
        }
        if (e.getSource() == b14) {
            t1.setText(t1.getText() + b14.getLabel());
        }
        if (e.getSource() == b4) {
            s1 = t1.getText();
            c = 1;
            t1.setText("");
        }
        if (e.getSource() == b8) {
            s1 = t1.getText();
            c = 2;
            t1.setText("");
        }
        if (e.getSource() == b12) {
            s1 = t1.getText();
            c = 3;
            t1.setText("");
        }
        if (e.getSource() == b13) {
            s1 = t1.getText();
            c = 4;
            t1.setText("");
        }
        if (e.getSource() == b15) {
            s1 = t1.getText();
            c = 5;
            t1.setText("");
        }
        int n = 0;
        if (e.getSource() == b16) {
            s2 = t1.getText();
            if (c == 0)
                t1.setText("ERROR");
            else if (c == 1) {
                n = Integer.parseInt(s1) % Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            } else if (c == 2) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            } else if (c == 3) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            } else if (c == 4) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                t1.setText(String.valueOf(n));

            } else if (c == 5) {
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
        }
    }

    public void paint(Graphics g) {

    }

    public static void main(String[] args) {
        Calculator b = new Calculator();
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