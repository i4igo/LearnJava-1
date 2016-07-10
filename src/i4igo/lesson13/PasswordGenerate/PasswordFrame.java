package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;

/** Created by Ev on 07.07.2016.
 *
 *  основное окно
 *
 */

public class PasswordFrame extends JFrame {

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;

    private PanelMain panelMain;

    PasswordFrame(){
        super();
        setTitle("Password generate");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);

        panelMain = new PanelMain();

        add(panelMain);

    }

    public void showPasswordFrame(){
        setVisible(true);
    }
}
