package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;

/**
 * Created by Ev on 09.07.2016.
 */

public class SliderPassword extends JSlider {


    SliderPassword(){
        super(HORIZONTAL, 0, 14, 5);

        setMajorTickSpacing(14/2);          // основные деления
        setMinorTickSpacing(14/14);         // дополнительные деления

        setPaintTicks(true);                // показать деления
        setPaintLabels(true);               // показать метки
    }

}
