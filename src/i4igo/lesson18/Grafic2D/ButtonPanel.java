package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Ev on 14.07.2016.
 */

public class ButtonPanel extends JPanel{

    private JButton buttonStart,
                    buttonStop;

    ButtonPanel(){

        buttonStart = new JButton("Start");
        buttonStop = new JButton("Stop");

        buttonStart.addActionListener((ActionEvent e) -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    MoveBall.modeStart();
                }
            }).start();
        });

        buttonStop.addActionListener((ActionEvent e) -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ////////////////////////////////////

                }
            }).start();
        });

        add(buttonStart);
        add(buttonStop);
    }


}
