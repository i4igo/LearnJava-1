package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;

/** Created by Ev on 09.07.2016.
 *
 *  конструктор SliderPassword
 *
 */

public class SliderPassword extends JSlider {


    SliderPassword(){

        setMinimum(0);
        setMaximum(14);
        setValue(5);

        setOrientation(HORIZONTAL);         // ориентация
        setMajorTickSpacing(14/2);            // основные деления
        setMinorTickSpacing(14/14);        // дополнительные деления

        //setSnapToTicks(true);             // привязка к делениям

        setPaintTicks(true);                // показать деления
        setPaintLabels(true);               // показать метки

        //setPaintTrack(true);              // изменять цвет дорожки
    }

}
