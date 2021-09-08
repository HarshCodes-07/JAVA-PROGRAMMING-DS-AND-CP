import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.applet.*;
import java.util.concurrent.Flow;

public class DrawAString extends Frame implements ActionListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private TextField t1;
    private String s1 = null;
    private String s2 = null;
    private int c = 0;
    int x = 150, y = 50, r=20;
    int dx = 11, dy = 7;


    private DrawAString() {
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x-r, y-r, r*2, r*2);
        while(true)
        {
            if(x>=500)
                break;
            // Bounce if we've hit an edge.
            if ((x - r + dx < 0) || (x + r + dx > bounds().width)) dx = -dx;
            if ((y - r + dy < 0) || (y + r + dy > bounds().height)) dy = -dy;
            // Move the circle.
            x += dx;  y += dy;

            try
            {
                Thread.sleep(50);
            }
            catch(Exception e)
            {
                System.out.println(e);
            };
            // print circle again n again.
            repaint();
        }
    }

    public static void main(String[] args) {
        DrawAString b = new DrawAString();
        b.setVisible(true);
        b.setSize(600, 700);
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