package Lesson18;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dejavu on 06.07.2016.
 * Main Window
 */
public class RootPanel extends JPanel {

    public RootPanel(int frameWidth, int frameHeight) {
        this.setBackground(Color.pink);
        setLayout(new BorderLayout());

        ChatPanel dialogPanel   = new ChatPanel();
        dialogPanel.setPreferredSize(new Dimension(2*frameWidth/3, 3*frameHeight/3));
        this.add(dialogPanel, BorderLayout.WEST);

        FriendsPanel friendsPanel = new FriendsPanel();
        friendsPanel.setPreferredSize(new Dimension(frameWidth/3, 3*frameHeight/3));
        this.add(friendsPanel, BorderLayout.EAST);

        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setPreferredSize(new Dimension(frameWidth, frameHeight/4));
        this.add(controlPanel, BorderLayout.SOUTH);
    }
}