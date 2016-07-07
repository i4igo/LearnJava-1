package i4igo.lesson13.SelectionOfColor;

import javax.swing.*;
import java.awt.*;

/** Created by Ev on 05.07.2016.
 *  конструктор TextField, его метод addTField(), возврящает созданную панель: TextField + надпись
 */

public class MyField extends JTextField{

    private String name;

    // конструктор поля
    MyField(String name){
        this.name = name;
        setColumns(10);                     // устанавливаем размер поля
        setText("0");
    }

    public JPanel addTField() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 5, 5));
        panel.add(new JLabel(name));
        panel.add(this);
        return panel;
    }

}
