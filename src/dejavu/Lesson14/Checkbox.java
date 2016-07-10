package dejavu.Lesson14;

import javax.swing.*;
import java.awt.event.ItemEvent;

/**
 * Created by dejavu on 10.07.2016.
 */
public class Checkbox extends JCheckBox {
    boolean state;

    public Checkbox (String title){
        super(title);

    }
    public boolean getStateCheckbox(){
        this.addItemListener(e -> {
            state = e.getStateChange() == ItemEvent.SELECTED;
        });

        return state;
    }
}
