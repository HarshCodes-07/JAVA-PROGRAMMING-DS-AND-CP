import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class TICTACTOE extends Frame implements ActionListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
    private TextField t2;
    private int c = 0, count = 0, x = -1;

    private TICTACTOE() {
        setLayout(null);
        TextField t1 = new TextField("TIC TAC TOE");
        t1.setLocation(100, 50);
        t1.setSize(200, 40);
        t1.setBackground(Color.green);
        add(t1);
        t2 = new TextField("");
        t2.setLocation(50, 400);
        t2.setSize(300, 40);
        t2.setBackground(Color.green);
        add(t2);
        b1 = new Button("");
        b1.setLocation(80, 120);
        b1.setSize(75, 75);
        add(b1);
        b2 = new Button("");
        b2.setLocation(160, 120);
        b2.setSize(75, 75);
        add(b2);
        b3 = new Button("");
        b3.setLocation(240, 120);
        b3.setSize(75, 75);
        add(b3);
        b4 = new Button("");
        b4.setLocation(80, 200);
        b4.setSize(75, 75);
        add(b4);
        b5 = new Button("");
        b5.setLocation(160, 200);
        b5.setSize(75, 75);
        add(b5);
        b6 = new Button("");
        b6.setLocation(240, 200);
        b6.setSize(75, 75);
        add(b6);
        b7 = new Button("");
        b7.setLocation(80, 280);
        b7.setSize(75, 75);
        add(b7);
        b8 = new Button("");
        b8.setLocation(160, 280);
        b8.setSize(75, 75);
        add(b8);
        b9 = new Button("");
        b9.setLocation(240, 280);
        b9.setSize(75, 75);
        add(b9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (x == -1) {
            if (e.getSource() == b1) {
                if (c1 == 0) {
                    if (c % 2 == 0)
                        b1.setLabel("X");
                    else
                        b1.setLabel("O");
                    c++;
                    c1++;
                }
            }
            if (e.getSource() == b2) {
                if (c2 == 0) {
                    if (c % 2 == 0)
                        b2.setLabel("X");
                    else
                        b2.setLabel("O");
                    c++;
                    c2++;
                }
            }
            if (e.getSource() == b3) {
                if (c3 == 0) {
                    if (c % 2 == 0)
                        b3.setLabel("X");
                    else
                        b3.setLabel("O");
                    c++;
                    c3++;
                }
            }
            if (e.getSource() == b4) {
                if (c4 == 0) {
                    if (c % 2 == 0)
                        b4.setLabel("X");
                    else
                        b4.setLabel("O");
                    c++;
                    c4++;
                }
            }
            if (e.getSource() == b5) {
                if (c5 == 0) {
                    if (c % 2 == 0)
                        b5.setLabel("X");
                    else
                        b5.setLabel("O");
                    c++;
                    c5++;
                }
            }
            if (e.getSource() == b6) {
                if (c6 == 0) {
                    if (c % 2 == 0)
                        b6.setLabel("X");
                    else
                        b6.setLabel("O");
                    c++;
                    c6++;
                }
            }
            if (e.getSource() == b7) {
                if (c7 == 0) {
                    if (c % 2 == 0)
                        b7.setLabel("X");
                    else
                        b7.setLabel("O");
                    c++;
                    c7++;
                }
            }
            if (e.getSource() == b8) {
                if (c8 == 0) {
                    if (c % 2 == 0)
                        b8.setLabel("X");
                    else
                        b8.setLabel("O");
                    c++;
                    c8++;
                }
            }
            if (e.getSource() == b9) {
                if (c9 == 0) {
                    if (c % 2 == 0)
                        b9.setLabel("X");
                    else
                        b9.setLabel("O");
                    c++;
                    c9++;
                }
            }
            count++;
            if (count > 8) {
                t2.setText("GAME DRAW");
                x = 1;
            }
            if (checkWin())
                if (c % 2 == 0) {
                    t2.setText("PLAYER 2 WON !");
                    x = 1;
                } else {
                    t2.setText("PLAYER 1 WON !");
                    x = 1;
                }
        }
    }

    private boolean checkWin() {

        if (b1.getLabel().equals(b2.getLabel()) && b2.getLabel().equals(b3.getLabel()) && !b1.getLabel().equals("") || b4.getLabel().equals(b5.getLabel()) && b5.getLabel().equals(b6.getLabel()) && !b4.getLabel().equals("") || b7.getLabel().equals(b8.getLabel()) && b8.getLabel().equals(b9.getLabel()) && !b7.getLabel().equals(""))
            return true;
        else if (b1.getLabel().equals(b4.getLabel()) && b4.getLabel().equals(b7.getLabel()) && !b1.getLabel().equals("") || b2.getLabel().equals(b5.getLabel()) && b5.getLabel().equals(b8.getLabel()) && !b2.getLabel().equals("") || b3.getLabel().equals(b6.getLabel()) && b6.getLabel().equals(b9.getLabel()) && !b3.getLabel().equals(""))
            return true;
        else
            return b1.getLabel().equals(b5.getLabel()) && b5.getLabel().equals(b9.getLabel()) && !b1.getLabel().equals("") || b3.getLabel().equals(b5.getLabel()) && b5.getLabel().equals(b7.getLabel()) && !b3.getLabel().equals("");
    }

    public void paint(Graphics g) {
    }

    public static void main(String[] args) {
        TICTACTOE b = new TICTACTOE();
        b.setVisible(true);
        b.setSize(400, 500);
        b.setLocation(150, 70);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.BLACK);
        Font f = new Font("BankGothic Md BT", Font.BOLD, 30);
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