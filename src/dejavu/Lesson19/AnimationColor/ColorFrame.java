package dejavu.Lesson19.AnimationColor;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by dejavu on 10.07.2016.
 * Application Color Animate
 */
public class ColorFrame extends JFrame {
    private Panel colorPanelLeft;
    private Panel colorPanelRight;

    private static int rColor = 0;
    private static int gColor = 0;
    private static int bColor = 0;

    final static int FRAME_WIDTH = 400;
    final static int FRAME_HEIGHT = 400;

    ColorFrame(){
        setTitle("Home Work Color selection");
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        Panel rootPanel = new Panel(FRAME_WIDTH, FRAME_HEIGHT);

        Panel panelTop = new Panel(FRAME_HEIGHT / 6 * 3);
        Panel panelMiddle = new Panel(FRAME_HEIGHT / 6);
        Panel panelButtom = new Panel(FRAME_HEIGHT / 6);

        colorPanelLeft  = new Panel(150, 150);
        colorPanelRight = new Panel(150, 150);

        Slider r = new Slider();
        Slider g = new Slider();
        Slider b = new Slider();

        Button button = new Button("Animate");
        button.addActionListener(e -> changeColors());

        setColors(colorPanelLeft);
        setColors(colorPanelRight);

        ChangeListener listenR = e -> {
            Slider source = (Slider) e.getSource();
            rColor = source.getValue();
            setColors(colorPanelRight);
        };

        ChangeListener listenG = e -> {
            Slider source = (Slider) e.getSource();
            gColor = source.getValue();
            setColors(colorPanelRight);
        };

        ChangeListener listenB = e -> {
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

    private void setColors(Panel panel) {

        rColor = (rColor > 255) ? (rColor < 0) ? 0: 255: rColor;
        gColor = (gColor > 255) ? (gColor < 0) ? 0: 255: gColor;
        bColor = (bColor > 255) ? (bColor < 0) ? 0: 255: bColor;

        panel.setBackground(new Color( rColor, gColor, bColor));
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

    void Show(){
        setVisible(true);
    }

}
