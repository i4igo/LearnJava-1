package dejavu.Lesson14;

import sun.plugin2.util.ColorUtil;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by dejavu on 10.07.2016.
 */
public class ColorFrame extends JFrame {
    private JPanel panel;

    private Slider r;
    private Slider g;
    private Slider b;

    private JLabel labelR;
    private JLabel labelG;
    private JLabel labelB;

    private ChangeListener listenR;
    private ChangeListener listenG;
    private ChangeListener listenB;

    private static int rColor = 128;
    private static int gColor = 128;
    private static int bColor = 128;



    public ColorFrame(){
        setTitle("Home Work Color selection");
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        setSize(400, 300);
        setLocation(500, 100);

        panel = new JPanel();
        panel.setBackground( new Color( rColor, gColor, bColor) );

        r = new Slider();
        g = new Slider();
        b = new Slider();

        labelR = new JLabel();
        labelG = new JLabel();
        labelB = new JLabel();

        labelR.setText("128");
        labelG.setText("128");
        labelB.setText("128");

        listenR = e -> {
            Slider source = (Slider) e.getSource();
            setLabel(labelR, "" + source.getValue());
            rColor = source.getValue();

            panel.setBackground( new Color( rColor, gColor, bColor) );
        };

        listenG = e -> {
            Slider source = (Slider) e.getSource();
            setLabel(labelG, "" + source.getValue());
            gColor = source.getValue();

            panel.setBackground( new Color( rColor, gColor, bColor) );
        };

        listenB = e -> {
            Slider source = (Slider) e.getSource();
            setLabel(labelB, "" + source.getValue());
            bColor = source.getValue();

            panel.setBackground( new Color( rColor, gColor, bColor) );
        };

        r.addChangeListener(listenR);
        g.addChangeListener(listenG);
        b.addChangeListener(listenB);

        panel.add(r);
        panel.add(g);
        panel.add(b);

        panel.add(labelR);
        panel.add(labelG);
        panel.add(labelB);

        add(panel);
    }

    public void setLabel(JLabel label, String i) {
        label.setText(i);
    }

    public void addNew(Component c){
        panel.add(c);
    }

    public void Show(){
        setVisible(true);
    }

}
