package i4igo.Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/** Created by Java base on 7/6/2016.
 *
 *
 *
 */

public class RootPanel extends JPanel implements ComponentListener {

    private DialogPanel dialogPanel;
    private OptionsPanel optionsPanel;

    private int frameWidth;
    private int frameHeight;

    public RootPanel(int frameWidth, int frameHeight) {
        this.frameWidth = frameWidth;                                                           // конструктор RootPanel2
        this.frameHeight = frameHeight;                                                         // конструктор RootPanel2

        setLayout(new BorderLayout());

        dialogPanel = new DialogPanel();
        dialogPanel.setPreferredSize(new Dimension((2*frameWidth/3), frameHeight));
        add(dialogPanel, BorderLayout.CENTER);

        optionsPanel = new OptionsPanel(frameWidth, frameHeight);
        optionsPanel.setPreferredSize(new Dimension((frameWidth/3), frameHeight));
        add(optionsPanel, BorderLayout.EAST);

        this.addComponentListener(this);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        RootPanel rb = (RootPanel) e.getSource();
        int newWidth = rb.getSize().width;
        int newHeight = rb.getSize().height;

        dialogPanel.setPreferredSize(new Dimension(2*newWidth/3, 2*newHeight/3));               //размер панели
        optionsPanel.setPreferredSize(new Dimension(newWidth/3, newHeight/3));                  //размер панели

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

