package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ev on 14.07.2016.
 */

public class GraficPanel extends JPanel {

    private int xOval = 10;

    GraficPanel() {
        super();
        setBackground(Color.LIGHT_GRAY);


    }


    public void paint(){
        for (int i=0; i<100; i++){
            xOval += 5;
            try {
                Thread.sleep(30);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            repaint();
        }
    }



    @Override
    public void paintComponent(Graphics g){
            super.paintComponent(g);

        g.fillOval(xOval, 70, 70, 70);
        
    }

}
