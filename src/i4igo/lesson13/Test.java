package com.itea.java.lesson13;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class Test {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                SliderTestFrame frame = new SliderTestFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
/**
 * Фрейм с линейными регуляторами и полем редактирования,
 * отображающим текущее значение выбранного регулятора.
 */

class SliderTestFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 350;
    public static final int DEFAULT_HEIGHT = 450;

    private JPanel sliderPanel;
    private JTextField textField;
    private ChangeListener listener;


    public SliderTestFrame() {
        setTitle("SliderTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        sliderPanel = new JPanel();
        sliderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Общий слушатель для всех регуляторов.
        listener = new ChangeListener() {
            public void stateChanged(ChangeEvent event)
            {
                // Обновление поля редактирования при
                // изменении значения регулятора.
                JSlider source = (JSlider) event.getSource();
                textField.setText("" + source.getValue());
            }
        };

        JSlider slider = new JSlider();

        // Добавление регулятора с числовыми метками.
        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Labels");


        // Добавление поля редактирования для
        // отображения значения регулятора.

        textField = new JTextField();
        add(sliderPanel, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
    }

    /*
     * Добавление регулятора в панель и связывание его со слушателем.
     * @param s Регулятор
     * @param description Описание регулятора
     */
    public void addSlider(JSlider s, String description)
    {
        s.addChangeListener(listener);
        JPanel panel = new JPanel();
        panel.add(s);
        panel.add(new JLabel(description));
        sliderPanel.add(panel);
    }

}
