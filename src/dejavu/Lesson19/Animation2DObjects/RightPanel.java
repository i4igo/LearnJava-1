package dejavu.Lesson19.Animation2DObjects;

import javax.swing.*;
import java.awt.*;

import static dejavu.Lesson19.Animation2DObjects.Frame.APP_HEIGHT;
import static dejavu.Lesson19.Animation2DObjects.Frame.APP_WIDTH;

/**
 * Created by dejavu on 12.07.2016.
 */
public class RightPanel extends JPanel {
    RightPanel(){
        initPanel();

        // Add controls checkbox (dots) for set lines path
    }

    private void initPanel() {
        setPreferredSize( new Dimension(APP_WIDTH /3, 3* APP_HEIGHT /4 ) );
        setBackground( new Color(42,112,182) );
    }
}
