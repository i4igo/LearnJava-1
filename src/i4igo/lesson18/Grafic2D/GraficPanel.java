package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;

import static i4igo.lesson18.Grafic2D.MoveBall.*;

/**
 * Created by Ev on 14.07.2016.
 */

public class GraficPanel extends JPanel {

    GraficPanel() {
        super();
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(xStartOval, yStartOval, widthOval, heightOval);
    }

}
