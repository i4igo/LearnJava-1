package i4igo.lesson18.Grafic2D;

import i4igo.Chat.OptionsPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ev on 14.07.2016.
 */

public class FramePanel extends JPanel{

    private GraficPanel graficPanel;
    private OptionPanel optionPanel;
    private ButtonPanel buttonPanel;

    private int widthFrame;
    private int heightFrame;

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

        buttonPanel = new ButtonPanel();     //добавить ссылки на другие панели
        buttonPanel.setPreferredSize(new Dimension(widthFrame, heightFrame/7));
        add(buttonPanel, BorderLayout.SOUTH);
    }

}
