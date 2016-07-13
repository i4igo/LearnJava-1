package dejavu.Lesson19.Animation2DObjects;

import dejavu.Lesson19.AnimationColor.Motions;

import javax.swing.*;
import java.awt.*;

import static dejavu.Lesson19.Animation2DObjects.Frame.APP_WIDTH;

/**
 * Created by dejavu on 12.07.2016.
 */
public class BottomPanel extends JPanel{
    public static Button bStart;
    public static Button bStop;

    BottomPanel(){
        initPanel();

        bStart = new Button("Start");
        bStop = new Button("Stop");

        bStart.addActionListener(e -> new Thread(
                Motions::startMove
        ).start());

        bStop.addActionListener(e -> {
            System.out.println("STOP");
            // Insert action for start Thread
        });

        add(bStart);
        add(bStop);
    }

    private void initPanel() {
        setPreferredSize( new Dimension(APP_WIDTH, 50 ) );
        setBackground( new Color(163,157,140) );
    }

    // Insert methods by control Thread
}
