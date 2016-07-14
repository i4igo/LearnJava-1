package i4igo.lesson18.Grafic2D;

import javax.swing.*;

/**
 * Created by Ev on 14.07.2016.
 */

public class Grafic2DFrame extends JFrame{

    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 700;

    private FramePanel framePanel;

    protected Grafic2DFrame(){
        super();

        setTitle("Grafic 2D");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);

        framePanel = new FramePanel(FRAME_WIDTH, FRAME_HEIGHT);

        add(framePanel);
    }

    public void showGrafic2DFrame() {
        this.setVisible(true);
    }
}
