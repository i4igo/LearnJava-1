package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/** Created by Ev on 09.07.2016.
 *
 *  панель слайдера
 *
 *  создаю слайдер, текстовое поле
 *  обработчик событий слайдера записывает в текстовое поле изменения
 *
 */

public class PanelSlider extends JPanel {

    private SliderPassword slider;
    private JTextField textFieldSlider;
    private ChangeListener listenerSlider;

    PanelSlider(){

        slider = new SliderPassword();
        textFieldSlider = new JTextField(String.valueOf(slider.getValue()), 5);

        //обработчик событий slider
        listenerSlider = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                SliderPassword slider = (SliderPassword) e.getSource();
                textFieldSlider.setText("" + slider.getValue());
            }
        };

        slider.addChangeListener(listenerSlider);

        add(slider);
        add(textFieldSlider);
    }

    public int getTextField(){
        return slider.getValue();
    }
}
