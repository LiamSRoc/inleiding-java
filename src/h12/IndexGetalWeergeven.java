package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndexGetalWeergeven extends Applet {

    TextField text;
    Button but;
    double[] num = {1,15,42,16,84,52,30,124,52,36,14,79,20,514,23,12,3,4,9,8,6};
    double search, Num2;
    int Num1, tel = 0, Num3;
    boolean t;

    public void init() {

        text = new TextField("",20);
        but = new Button("Ok");
        but.addActionListener( new But1Listener() );
        t = false;
        add(text);
        add(but);
    }

    public void paint(Graphics g) {

        if(t == true) {
            g.drawString("Waarde is gevonden "+Num2+" Index waarde is: "+Num3,20,50);
        }
        else {
            g.drawString("Waarde: "+Num1+" is niet gevonden.",20, 50);
        }
    }

    class But1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Num1 = Integer.parseInt( text.getText() );
            search = Num1;
            t = false;
            for (tel = 0; tel < num.length; tel++) {
                if (num[tel] == search) {
                    t = true;
                    Num2 = num[tel];
                    Num3 = tel;

                    // Opdracht 12.5
                    break;
                }
            }
            repaint();
        }
    }
}