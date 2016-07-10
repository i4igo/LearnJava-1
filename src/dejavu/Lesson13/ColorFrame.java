package dejavu.Lesson13;

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

    private Label labelR;
    private Label labelG;
    private Label labelB;
    private Label labelHash;

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

        r = new Slider();
        g = new Slider();
        b = new Slider();

        labelR = new Label();
        labelG = new Label();
        labelB = new Label();
        labelHash = new Label();

        setLabel(labelR, "" + rColor);
        setLabel(labelG, "" + gColor);
        setLabel(labelB, "" + bColor);

        setColors();

        listenR = e -> {
            Slider source = (Slider) e.getSource();
            setLabel(labelR, "" + source.getValue());
            rColor = source.getValue();
            setColors();
        };

        listenG = e -> {
            Slider source = (Slider) e.getSource();
            setLabel(labelG, "" + source.getValue());
            gColor = source.getValue();
            setColors();
        };

        listenB = e -> {
            Slider source = (Slider) e.getSource();
            setLabel(labelB, "" + source.getValue());
            bColor = source.getValue();
            setColors();
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
        panel.add(labelHash);

        add(panel);
    }

    private void setColors() {

        if(rColor > 255) rColor = 255;
        if(gColor > 255) gColor = 255;
        if(bColor > 255) bColor = 255;

        if(rColor < 0) rColor = 0;
        if(gColor < 0) gColor = 0;
        if(bColor < 0) bColor = 0;

        panel.setBackground( new Color( rColor, gColor, bColor) );

        labelR.setBackground( Color.white );
        labelG.setBackground( Color.white );
        labelB.setBackground( Color.white );
        labelHash.setBackground( Color.white );


        setLabel(labelHash, "#"
                + Integer.toHexString(rColor)
                + Integer.toHexString(gColor)
                + Integer.toHexString(bColor) );


    }

    public void setLabel(JLabel label, String i) {
        label.setText(i);
    }

    public void Show(){
        setVisible(true);
    }

}
