package i4igo.lesson18.Grafic2D;

import javax.swing.*;

/**
 * Created by Ev on 14.07.2016.
 */

public class MyRadioButton extends JRadioButton {

    private String name;

    MyRadioButton(String name){
        this.name = name;
        setText(name);
    }
}
