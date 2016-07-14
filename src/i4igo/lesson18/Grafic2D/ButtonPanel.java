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
        setBackground(Color.cyan);

        JButton button = new JButton("Start");
        button.addActionListener((ActionEvent e) -> {
            // запускаем шарик (наверное, в отдельном потоке)
            button.setText("Ok");
        });

        add(button);
    }
}
