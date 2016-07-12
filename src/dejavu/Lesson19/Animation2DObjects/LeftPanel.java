package dejavu.Lesson19.Animation2DObjects;

import javax.swing.*;
import java.awt.*;

import static dejavu.Lesson19.Animation2DObjects.Frame.APP_HEIGHT;
import static dejavu.Lesson19.Animation2DObjects.Frame.APP_WIDTH;

/**
 * Created by dejavu on 12.07.2016.
 */
public class LeftPanel extends JPanel {
    static int xAxis = 20;
    static int yAxis = 20;

    LeftPanel (){
        initPanel();
    }

    private void initPanel(){
        setPreferredSize( new Dimension(2* APP_WIDTH /3, 3* APP_HEIGHT /4 ) );
        setBackground( new Color(204,204,204) );
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(4,58,143));
        g.fillOval(xAxis, yAxis, 30, 30);
    }

}
