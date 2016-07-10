package dejavu.Lesson14;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

/**
 * Created by dejavu on 10.07.2016.
 */
public class Slider extends JSlider {
    ChangeListener listener;

    public Slider(){
        super(6, 14, 13);

        setMajorTickSpacing(1);
        setPaintTicks(true);
        setPaintTrack(true);
        setPaintLabels(true);
    }

    public void getListen(JLabel label){
        listener = e-> {
            Slider source = (Slider) e.getSource();
            label.setText( "" + source.getValue() );
        };

        this.addChangeListener(listener);
    }
}
