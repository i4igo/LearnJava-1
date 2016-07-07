package i4igo.lesson13.SelectionOfColor;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

/** Created by Ev on 04.07.2016.
 *  конструктор Slider, его метод addSlider(), возврящает созданную панель: Slider + надпись
 */

public class MySlider extends JSlider {

    private String name;

    // конструктор ползунка
    MySlider(String name) {

        this.name = name;
        setName(name);

        setOrientation(VERTICAL);           // ориентация вертикальная

        // определение интервала значений
        setMinimum(0);
        setMaximum(255);
        setValue(0);

        setMajorTickSpacing(255);           // основные деления
        setMinorTickSpacing(255 / 5);       // дополнительные деления
        //slider1.setSnapToTicks(true);     // привязка к делениям
        setPaintTicks(true);                // показать деления
        setPaintLabels(true);               // показать метки
        //setPaintTrack(true);                // изменять цвет дорожки

        //setBackground(Color.LIGHT_GRAY);    // указать цвет

    }


    public JPanel addSlider() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(this, BorderLayout.NORTH);
        panel.add(new JLabel(name), BorderLayout.SOUTH);
        return panel;
    }

}
