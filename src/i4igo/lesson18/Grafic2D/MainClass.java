package i4igo.lesson18.Grafic2D;

import java.awt.*;

/**
 * Created by Ev on 14.07.2016.
 */

public class MainClass {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Grafic2DFrame window = new Grafic2DFrame();
                window.setDefaultCloseOperation(Grafic2DFrame.EXIT_ON_CLOSE);
                window.showGrafic2DFrame();
            }
        });
    }
}
