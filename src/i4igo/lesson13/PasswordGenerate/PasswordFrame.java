package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ev on 07.07.2016.
 */
public class PasswordFrame extends JFrame {

    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;

    PasswordFrame(){
        super();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setBackground(Color.LIGHT_GRAY);

    }

    public void showPasswordFrame(){
        setVisible(true);
    }
}
