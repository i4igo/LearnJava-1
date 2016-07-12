package dejavu.Lesson19.AnimationColor;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dejavu on 10.07.2016.
 */
public class ColorFrame extends JFrame {
    private Panel rootPanel;
    private Panel panelTop;
    private Panel panelMiddle;
    private Panel panelButtom;
    private Panel colorPanelLeft;
    private Panel colorPanelRight;


    private Slider r;
    private Slider g;
    private Slider b;

    private ChangeListener listenR;
    private ChangeListener listenG;
    private ChangeListener listenB;

    private static int rColor = 0;
    private static int gColor = 0;
    private static int bColor = 0;

    final static int FRAME_WIDTH = 400;
    final static int FRAME_HEIGHT = 400;



    public ColorFrame(){
        setTitle("Home Work Color selection");
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        rootPanel = new Panel(FRAME_WIDTH, FRAME_HEIGHT);

        panelTop    = new Panel( FRAME_HEIGHT / 6 * 3);
        panelMiddle = new Panel( FRAME_HEIGHT / 6 );
        panelButtom = new Panel( FRAME_HEIGHT / 6 );

        colorPanelLeft  = new Panel(150, 150);
        colorPanelRight = new Panel(150, 150);

        r = new Slider();
        g = new Slider();
        b = new Slider();

        Button button = new Button("Animate");
        button.addActionListener(e -> {
            changeColors();
        });

        setColors(colorPanelLeft);
        setColors(colorPanelRight);

        listenR = e -> {
            Slider source = (Slider) e.getSource();
            rColor = source.getValue();
            setColors(colorPanelRight);
        };

        listenG = e -> {
            Slider source = (Slider) e.getSource();
            gColor = source.getValue();
            setColors(colorPanelRight);
        };

        listenB = e -> {
            Slider source = (Slider) e.getSource();
            bColor = source.getValue();
            setColors(colorPanelRight);
        };

        r.addChangeListener(listenR);
        g.addChangeListener(listenG);
        b.addChangeListener(listenB);

        panelTop.add(colorPanelLeft);
        panelTop.add(colorPanelRight);

        panelMiddle.add(r);
        panelMiddle.add(g);
        panelMiddle.add(b);

        panelButtom.add(button);

        rootPanel.add(panelTop,    BorderLayout.NORTH);
        rootPanel.add(panelMiddle, BorderLayout.CENTER);
        rootPanel.add(panelButtom, BorderLayout.SOUTH);

        add(rootPanel);
    }

    private void setColors(Panel panel) {

        rColor = (rColor > 255) ? (rColor < 0) ? 0: 255: rColor;
        gColor = (gColor > 255) ? (gColor < 0) ? 0: 255: gColor;
        bColor = (bColor > 255) ? (bColor < 0) ? 0: 255: bColor;

        panel.setBackground(new Color( rColor, gColor, bColor));
    }

    private void changeColors(){

        int newR = rColor;
        int newG = gColor;
        int newB = bColor;

        rColor = colorPanelLeft.getBackground().getRed();
        gColor = colorPanelLeft.getBackground().getGreen();
        bColor = colorPanelLeft.getBackground().getBlue();

        int maxIteration = getMaxIteration(newR, newB, newG);

        new Thread(() -> {
            int i = 0;

            while(i < maxIteration){
                if ( rColor != newR ) rColor = getNextColor(rColor, newR);
                if ( gColor != newG ) gColor = getNextColor(gColor, newG);
                if ( bColor != newB ) bColor = getNextColor(bColor, newB);

                setColors(colorPanelLeft);
                i++;

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private int getNextColor(int oldColor, int newColor){
        int nextColor;

        if ( oldColor >  newColor ) oldColor--;
        if ( oldColor <  newColor ) oldColor++;

        nextColor = oldColor;

        return nextColor;
    }

    private int getMaxIteration(int a, int b, int c){
        int max;

        int maxR = (a > rColor) ? a - rColor : rColor - a;
        int maxG = (b > gColor) ? b - gColor : gColor - b;
        int maxB = (c > bColor) ? c - bColor : bColor - c;

        max = Math.max( Math.max( maxR, maxG ), maxB );

        return max;
    }

    public void Show(){
        setVisible(true);
    }

}
