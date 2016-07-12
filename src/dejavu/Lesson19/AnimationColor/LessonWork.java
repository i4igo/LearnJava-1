package dejavu.Lesson19.AnimationColor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LessonWork {

	public static void main(String[] args) {

        JFrame frame    = new JFrame("Hello Swing!!");
        JPanel panel    = new JPanel();
        JButton button1 = new JButton("Btn1");

		frame.setBounds(200,200,400,300);

        ActionListener a1 = new SomeClass();
        button1.addActionListener(a1);

		panel.add(button1);
        frame.add(panel);

        frame.setVisible(true);
	}

    private static class SomeClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hello");
        }
    }
}
