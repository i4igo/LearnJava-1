package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ev on 14.07.2016.
 */

public class OptionPanel extends JPanel {

    MyRadioButton radioButton1;
    MyRadioButton radioButton2;
    MyRadioButton radioButton3;
    MyRadioButton radioButton4;
    MyRadioButton radioButton5;

    OptionPanel(){
        super();
        setBackground(Color.gray);
        setLayout(new GridLayout(10,0,10,10));
        radioButton1 = new MyRadioButton();
        radioButton2 = new MyRadioButton();
        radioButton3 = new MyRadioButton();
        radioButton4 = new MyRadioButton();
        radioButton5 = new MyRadioButton();

        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
        add(radioButton4);
        add(radioButton5);
    }
}
