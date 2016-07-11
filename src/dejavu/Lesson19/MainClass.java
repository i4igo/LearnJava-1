package dejavu.Lesson19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dejavu on 11.07.2016.
 */
public class MainClass {
    static int xRect;

    public static void main(String[] args){

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
                        repaint();
                    }
                });
            });

            this.add(b);
            this.setBackground(Color.green);

        }

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.fillRect(xRect, 70, 80, 120);
            System.out.println("paintComponent");
        }
    }
}
