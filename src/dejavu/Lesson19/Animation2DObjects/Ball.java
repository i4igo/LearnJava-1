package dejavu.Lesson19.Animation2DObjects;

import javax.swing.*;
import java.awt.*;

import static dejavu.Lesson19.Animation2DObjects.Motions.x1;
import static dejavu.Lesson19.Animation2DObjects.Motions.y1;

/**
 * Created by dejavu on 13.07.2016.
 */
public class Ball extends JPanel{
    public Ball(){
        super();


    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(4,58,143));
        g.fillOval(x1, y1, 30, 30);
    }
}
