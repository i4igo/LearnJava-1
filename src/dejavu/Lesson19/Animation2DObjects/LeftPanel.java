package dejavu.Lesson19.Animation2DObjects;


import javax.swing.*;
import java.awt.*;

import static dejavu.Lesson19.Animation2DObjects.Frame.APP_HEIGHT;
import static dejavu.Lesson19.Animation2DObjects.Frame.APP_WIDTH;
import static dejavu.Lesson19.Animation2DObjects.Motions.*;

/**
 * Created by dejavu on 12.07.2016.
 */
public class LeftPanel extends JPanel {
    public static Graphics ball;

    LeftPanel (){
        initPanel();

        // Вызвать repaint() из другого класса
//        Ball ball = new Ball();
//
//        add(ball);

    }

    private void initPanel(){
        setPreferredSize( new Dimension(2* APP_WIDTH /3, APP_HEIGHT - 50 ) );
        setBackground( new Color(204,204,204) );
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(4,58,143));
        g.fillOval(x1, y1, 30, 30);
    }
}
