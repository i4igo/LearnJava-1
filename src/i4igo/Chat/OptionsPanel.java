package i4igo.Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 * Created by Ev on 10.07.2016.
 */

public class OptionsPanel extends JPanel implements ComponentListener{

    private FriendsPanel friendsPanel;
    private ControlsPanel controlsPanel;

    private int frameWidth;
    private int frameHeight;

    OptionsPanel(int frameWidth, int frameHeight){
        this.frameWidth = frameWidth/3;
        this.frameHeight = frameHeight;

        setLayout(new BorderLayout());
        //setBackground(Color.GRAY);

        friendsPanel = new FriendsPanel();
        friendsPanel.setPreferredSize(new Dimension(frameWidth, 3*frameHeight/4));
        add(friendsPanel, BorderLayout.CENTER);

        controlsPanel = new ControlsPanel();
        controlsPanel.setPreferredSize(new Dimension(frameWidth, frameHeight/4));
        add(controlsPanel, BorderLayout.SOUTH);

        this.addComponentListener(this);

    }

    @Override
    public void componentResized(ComponentEvent e) {
        OptionsPanel op = (OptionsPanel) e.getSource();
        int newWidth = op.getSize().width;
        int newHeight = op.getSize().height;

        friendsPanel.setPreferredSize(new Dimension(newWidth, 3*newHeight/4));               //размер панели
        controlsPanel.setPreferredSize(new Dimension(newWidth, newHeight/4));                  //размер панели
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
