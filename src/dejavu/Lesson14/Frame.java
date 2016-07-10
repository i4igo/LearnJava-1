package dejavu.Lesson14;

import javax.swing.*;

/**
 * Created by dejavu on 10.07.2016.
 */
public class Frame extends JFrame {
    final static int FRAME_WIDTH = 600;
    final static int FRAME_HEIGHT = 400;

    public Frame(){
        Init();

        LeftSide leftPanel = new LeftSide();
        RightSide rightPanel = new RightSide();

        add(leftPanel);
        add(rightPanel);
    }

    public void Show(){
        setVisible(true);
    }

    private void Init(){
        setTitle("Password Generator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(500,400);
    }
}
