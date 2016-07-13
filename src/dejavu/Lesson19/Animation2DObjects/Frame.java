package dejavu.Lesson19.Animation2DObjects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dejavu on 12.07.2016.
 */
public class Frame extends JFrame {
    public final static int APP_WIDTH = 840;
    public final static int APP_HEIGHT = 500;

    Frame (){
        initFrame();

        LeftPanel lfPanel = new LeftPanel();
        RightPanel rgPanel = new RightPanel();
        BottomPanel bPanel = new BottomPanel(lfPanel);


        add(lfPanel, BorderLayout.WEST);
        add(rgPanel, BorderLayout.EAST);
        add(bPanel, BorderLayout.SOUTH);
    }

    private void initFrame() {
        setTitle("Animation 2D Object");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(APP_WIDTH,APP_HEIGHT);
    }

    void showApp() {
        setVisible(true);
    }
}
