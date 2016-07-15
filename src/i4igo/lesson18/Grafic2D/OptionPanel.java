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
    MyRadioButton radioButton6;

    OptionPanel(){
        super();
        setLayout(new GridLayout(10,0,10,10));
        radioButton1 = new MyRadioButton("По горизонтали");
        radioButton2 = new MyRadioButton("По квадрату");
        radioButton3 = new MyRadioButton("Ускоренное по горизонтали");
        radioButton4 = new MyRadioButton("По кругу");
        radioButton5 = new MyRadioButton("По квадрату с закругленными краями");
        radioButton6 = new MyRadioButton("По восьмерке");

        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
        add(radioButton4);
        add(radioButton5);
        add(radioButton6);
    }

    public void getRadioButton(){

    }
}
