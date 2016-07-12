package dejavu.Lesson19.AnimationColor;

import javax.swing.*;

import java.awt.*;

import static dejavu.Lesson19.AnimationColor.ColorFrame.FRAME_WIDTH;


/**
 * Created by dejavu on 12.07.2016.
 */
public class Panel extends JPanel {
    public Panel(int height) {
        setPreferredSize( new Dimension(FRAME_WIDTH, height));
    }

    public Panel(int height, int width) {
        setPreferredSize( new Dimension(width, height));
    }
}
