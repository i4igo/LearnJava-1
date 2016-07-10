package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;

/** Created by Ev on 09.07.2016.
 *
 *   конструктор DigitCheckBox
 */

public class DigitCheckBox extends JCheckBox{

    private String name;

    DigitCheckBox(String name){
        this.name = name;
        setText(name);
        setName(name);
    }

}
