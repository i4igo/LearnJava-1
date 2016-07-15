package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Ev on 14.07.2016.
 */

public class ButtonPanel extends JPanel{

    JButton buttonStart;
    JButton buttonStop;

    private int xOval;
    private GraficPanel gp;

    ButtonPanel(GraficPanel gp){
        this.gp = gp;
        buttonStart = new JButton("Start");

        buttonStart.addActionListener((ActionEvent e) -> {
            // запускаем шарик (наверное, в отдельном потоке)
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //////////////////////////////
                    gp.paint();
                }
            }).start();
        });

        buttonStop = new JButton("Stop");

        add(buttonStart);
        add(buttonStop);
    }

/*
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillOval(xOval, 70, 70, 70);

    }*/



}
