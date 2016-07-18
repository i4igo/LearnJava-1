package i4igo.lesson18.Grafic2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

/**
 * Created by Ev on 14.07.2016.
 */

public class OptionPanel extends JPanel {

    private JRadioButton radioButton1,
                         radioButton2,
                         radioButton3,
                         radioButton4,
                         radioButton5,
                         radioButton6;

    private ButtonGroup groupButton;

    OptionPanel(){
        super();
        setLayout(new GridLayout(15,0,10,10));

        radioButton1 = new JRadioButton("По горизонтали");
        radioButton1.setActionCommand("horizontal");
        radioButton1.setSelected(true);

        radioButton2 = new JRadioButton("Ускоренное по горизонтали");
        radioButton2.setActionCommand("upHorizontal");

        radioButton3 = new JRadioButton("По квадрату");
        radioButton3.setActionCommand("square");

        radioButton4 = new JRadioButton("По кругу");
        radioButton4.setActionCommand("circle");

        radioButton5 = new JRadioButton("По квадрату с закругленными краями");
        radioButton5.setActionCommand("roundSquare");

        radioButton6 = new JRadioButton("По восьмерке");
        radioButton6.setActionCommand("eight");

        groupButton = new ButtonGroup();
        groupButton.add(radioButton1);
        groupButton.add(radioButton2);
        groupButton.add(radioButton3);
        groupButton.add(radioButton4);
        groupButton.add(radioButton5);
        groupButton.add(radioButton6);

        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
        add(radioButton4);
        add(radioButton5);
        add(radioButton6);
    }

    public String getRadioButton(){
        return groupButton.getSelection().getActionCommand();
    }
}
