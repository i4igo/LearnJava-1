package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;


/**
 * Created by Ev on 14.07.2016.
 */

public class FramePanel extends JPanel {

    private GraficPanel graficPanel;
    private OptionPanel optionPanel;
    private ButtonPanel buttonPanel;

    private MoveBall moveBall;

    private int widthFrame;
    private int heightFrame;

    private ComponentListener listenerPanel;

    FramePanel(int widthFrame, int heightFrame){
        this.widthFrame = widthFrame;
        this.heightFrame = heightFrame;

        setLayout(new BorderLayout());

        graficPanel = new GraficPanel();
        graficPanel.setPreferredSize(new Dimension(3*widthFrame/4, heightFrame));
        add(graficPanel, BorderLayout.CENTER);

        optionPanel = new OptionPanel();
        optionPanel.setPreferredSize(new Dimension(widthFrame/4, heightFrame));
        add(optionPanel, BorderLayout.EAST);

        buttonPanel = new ButtonPanel();                                                        //добавить ссылки на другие панели
        buttonPanel.setPreferredSize(new Dimension(widthFrame, heightFrame/8));
        add(buttonPanel, BorderLayout.SOUTH);

        moveBall = new MoveBall(optionPanel, graficPanel);

        listenerPanel = new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                FramePanel rb = (FramePanel) e.getSource();
                int newWidth = rb.getSize().width;
                int newHeight = rb.getSize().height;

                graficPanel.setPreferredSize(new Dimension(3*newWidth/4, newHeight));               //размер панели
                optionPanel.setPreferredSize(new Dimension(newWidth/4, newHeight));                  //размер панели
                buttonPanel.setPreferredSize(new Dimension(newWidth, newHeight/8));                  //размер панели
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
        };

        addComponentListener(listenerPanel);
    }

}
