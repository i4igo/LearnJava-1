package dejavu.Lesson19;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dejavu on 11.07.2016.
 */
public class MainClass {
    static int xRect;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        BallPanel bP = new BallPanel();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        frame.add(bP);

        frame.setVisible(true);

    }

    public static class BallPanel extends JPanel{

        public BallPanel(){
            super();

            xRect = 100;

            JButton b = new JButton("Button");

            b.addActionListener(e -> {
                new Thread(() -> {
                    for(int i = 0; i<30; i++){
                        xRect +=5;

                        try { Thread.sleep(200); } catch (InterruptedException e1) { e1.printStackTrace(); }

                        repaint();
                    }
                }).start();
            });

            this.add(b);
        }

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.fillRect(xRect, 70, 80, 120);
        }
    }
}
