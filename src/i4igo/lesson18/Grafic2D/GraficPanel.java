package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ev on 14.07.2016.
 */

public class GraficPanel extends JPanel {

    private final int xRect = 10;

    GraficPanel() {
        super();
        setBackground(Color.LIGHT_GRAY);



    }
    
    protected void paintComponent(Graphics g){
            super.paintComponent(g);

        g.fillOval(xRect, 70, 100, 100);
        
    }

}
