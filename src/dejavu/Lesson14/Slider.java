package dejavu.Lesson14;

import javax.swing.*;

/**
 * Created by dejavu on 10.07.2016.
 */
public class Slider extends JSlider {
    private final static int MIN_COLOR = 0;
    private final static int MAX_COLOR = 255;
    public final static int INIT_COLOR = 128;

    public Slider() {
        super(VERTICAL, MIN_COLOR, MAX_COLOR, INIT_COLOR);
    }
}
