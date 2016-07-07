package i4igo.lesson13.SelectionOfColor;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/** Created by Ev on 03.07.2016.
 *  конструктор создает окно, задает его параметры
 *
 *  4 панели, создает 3 поля и 3 слайдера, включает обработчики событий на слайдеры и поля
 *  слайдеры добавляет на соответствующую панель, поля - на свою панель
 *  panelColor, отображает цвет, который мы изменяем с помощью слайдеров
 *  добавляет эти панели на основную панель окна
 *
 *  метод showMyFrame() - делает окно видимым
 */

public class MyFrame extends JFrame {

    private JPanel panel1;
    private JPanel panelSlider;
    private JPanel panelTField;
    private JPanel panelColor;

    private MyField field1;
    private MyField field2;
    private MyField field3;

    private MySlider slider1;
    private MySlider slider2;
    private MySlider slider3;

    private ChangeListener listenerSlider;
    private CaretListener listenerField;

    MyFrame() {
        setTitle("Selection of Color");
        setSize(400, 300);
        setLocation(200, 200);

        // создаем основную панель
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        panelSlider = new JPanel();
        panelSlider.setLayout(new FlowLayout());

        panelTField = new JPanel();
        panelTField.setLayout(new BorderLayout());

        panelColor = new JPanel();
        panelColor.setBackground(new Color(255,255,255));

        // обработчик событий ползунка
        listenerSlider = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent event) {

                int red = 0;
                int green = 0;
                int blue = 0;

                MySlider slider = (MySlider) event.getSource();
                switch (slider.getName()){
                    case "Red":
                        red = slider.getValue();
                        field1.setText("" + red);
                        break;

                    case "Green":
                        green = slider.getValue();
                        field2.setText("" + green);
                        break;

                    case "Blue":
                        blue = slider.getValue();
                        field3.setText("" + blue);
                        break;

                    default:
                        System.out.println("error");
                }
            }
        };

        // обработчик событий текстового поля
        listenerField = new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int l1 = 0;
                int l2 = 0;
                int l3 = 0;
                MyField source = (MyField) e.getSource();
                l1 = field1.getText().length() > 0 ? Integer.parseInt(field1.getText()) : 0;
                l2 = field2.getText().length() > 0 ? Integer.parseInt(field2.getText()) : 0;
                l3 = field3.getText().length() > 0 ? Integer.parseInt(field3.getText()) : 0;
                panelColor.setBackground(new Color(l1,l2,l3));
            }
        };

        // создаем 3 поля с подписями (свой конструктор)
        field1 = new MyField("Red");
        field2 = new MyField("Green");
        field3 = new MyField("Blue");

        // слушатель поля
        field1.addCaretListener(listenerField);
        field2.addCaretListener(listenerField);
        field3.addCaretListener(listenerField);


        // создаем панель полей
        panelTField.add(field1.addTField(), BorderLayout.NORTH);
        panelTField.add(field2.addTField(), BorderLayout.CENTER);
        panelTField.add(field3.addTField(), BorderLayout.SOUTH);


        // создаем 3 ползунка с подписями (свой конструктор)
        slider1 = new MySlider("Red");
        slider2 = new MySlider("Green");
        slider3 = new MySlider("Blue");

        slider1.addChangeListener(listenerSlider);
        slider2.addChangeListener(listenerSlider);
        slider3.addChangeListener(listenerSlider);

        panelSlider.add(slider1.addSlider());
        panelSlider.add(slider2.addSlider());
        panelSlider.add(slider3.addSlider());


        // добавляем на основную панель, 3 панели
        panel1.add(panelSlider);
        panel1.add(panelTField);
        panel1.add(panelColor);


        // добавляем на окно основную панель
        add(panel1);
    }

    public void showMyFrame(){
        setVisible(true);
    }

}


