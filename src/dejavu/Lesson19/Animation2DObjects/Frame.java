package dejavu.Lesson19.Animation2DObjects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dejavu on 12.07.2016.
 */
public class Frame extends JFrame {
    final static int APP_WIDTH = 800;
    final static int APP_HEIGHT = 600;

    Frame (){
        initFrame();

        LeftPanel lfPanel = new LeftPanel();
        RightPanel rgPanel = new RightPanel();
        BottomPanel bPanel = new BottomPanel();


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
