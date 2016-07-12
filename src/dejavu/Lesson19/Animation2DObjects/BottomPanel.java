package dejavu.Lesson19.Animation2DObjects;

import javax.swing.*;
import java.awt.*;

import static dejavu.Lesson19.Animation2DObjects.Frame.APP_HEIGHT;
import static dejavu.Lesson19.Animation2DObjects.Frame.APP_WIDTH;

/**
 * Created by dejavu on 12.07.2016.
 */
public class BottomPanel extends JPanel{
    BottomPanel(){
        initPanel();

        Button start = new Button("Start");
        Button stop  = new Button("Stop");

        start.addActionListener( e -> {
            System.out.println("START");
            // Insert action for start Thread
        });

        stop.addActionListener( e -> {
            System.out.println("STOP");
            // Insert action for stop Thread
        });

        add(start);
        add(stop);
    }

    private void initPanel() {
        setPreferredSize( new Dimension(APP_WIDTH, APP_HEIGHT /4 ) );
        setBackground( new Color(163,157,140) );
    }

    // Insert methods by control Thread
}
