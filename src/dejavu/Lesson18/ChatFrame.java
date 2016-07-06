package dejavu.Lesson18;

import javax.swing.*;

/**
 * Created by dejavu on 06.07.2016.
 * Graphic elements
 */
public class ChatFrame extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 500;

    public ChatFrame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocationRelativeTo(null);

        RootPanel rootPanel = new RootPanel(FRAME_WIDTH, FRAME_HEIGHT);
        this.add(rootPanel);


    }

}
