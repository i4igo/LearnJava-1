package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;
import java.awt.*;


/** Created by Ev on 09.07.2016.
 *
 *  основная панель панель, на которой размещены 2 дополнительных:
 *  - панель для слайдера
 *  - панель для кнопки
 */

public class PanelMain extends JPanel {

    private PanelSlider panelSlider;
    private PanelOptions panelOptions;


    PanelMain(){

        panelSlider = new PanelSlider();
        panelOptions = new PanelOptions(panelSlider);

        add(panelSlider);
        add(panelOptions);
    }
}
