package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Ev on 14.07.2016.
 */

public class ButtonPanel extends JPanel{
    ButtonPanel(){
        super();
        JButton buttonStart = new JButton("Start");
        buttonStart.addActionListener((ActionEvent e) -> {
            // запускаем шарик (наверное, в отдельном потоке)
            buttonStart.setText("Ok");
        });

        JButton buttonStop = new JButton("Stop");

        add(buttonStart);
        add(buttonStop);
    }
}
