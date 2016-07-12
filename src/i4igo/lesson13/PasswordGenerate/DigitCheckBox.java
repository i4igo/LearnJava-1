package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Ev on 09.07.2016.
 */

public class DigitCheckBox extends JCheckBox{

    private boolean state;

    DigitCheckBox(String name){
        super(name);
    }

    public boolean getCheckBox(){
        this.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                state = (e.getStateChange() == ItemEvent.SELECTED);
            }
        });
        return state;
    }
}
