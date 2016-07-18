package dejavu.Lesson21;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Java base on 7/18/2016.
 * Lesson Work 21
 */
public class MainClass {
    public static String[] cities ={};

    public static void main(String[] args){
        innit();

    }

    private static void innit() {
        JFrame frame = new JFrame();

        GridLayout gl = new GridLayout(7,2);
        JPanel personsPanel = new JPanel(gl);

        JLabel lLastName = new JLabel("Last Name");
        JTextField tfLastName = new JTextField();

        JLabel lName = new JLabel("Name");
        JTextField tfName = new JTextField();

        JLabel lSecondName = new JLabel("Second Name");
        JTextField tfSecondName = new JTextField();

        JLabel lAge = new JLabel("Age");
        JTextField tfAge = new JTextField();

        JLabel lCity = new JLabel("City");
        JComboBox<String> cdCity = new JComboBox<>(cities);

        JButton bCity = new JButton("City");
        JButton bAdd = new JButton("Add");

        personsPanel.add(lLastName);
        personsPanel.add(tfLastName);

        personsPanel.add(lName);
        personsPanel.add(tfName);

        personsPanel.add(lSecondName);
        personsPanel.add(tfSecondName);

        personsPanel.add(lAge);
        personsPanel.add(tfAge);

        personsPanel.add(lCity);
        personsPanel.add(cdCity);

        personsPanel.add(new JFrame());
        personsPanel.add(bCity);

        personsPanel.add(bAdd);
        personsPanel.add(new JFrame());

        frame.add(personsPanel);

        frame.setSize(600, 400);
        frame.setVisible(true);

    }
}
