package dejavu.Lesson19.Animation2DObjects;

import javax.swing.*;
import java.awt.*;

import static dejavu.Lesson19.Animation2DObjects.Frame.APP_HEIGHT;
import static dejavu.Lesson19.Animation2DObjects.Frame.APP_WIDTH;

/**
 * Created by dejavu on 12.07.2016.
 */
public class RightPanel extends JPanel {
    private JPanel buttonBox;
    private JRadioButton toHorizontal, toSquare, toSpeed, toCircle, toSquareRadius, toEight;
    private static ButtonGroup buttonGroup = null;

    private Color bgColor = new Color(42,112,182);

    RightPanel(){
        initPanel();

        buttonBox       = new JPanel();
        buttonGroup     = new ButtonGroup();
        toHorizontal    = new JRadioButton("По горизонтали");
        toSquare        = new JRadioButton("По квадрату");
        toSpeed         = new JRadioButton("Ускоренное по горизонтали");
        toCircle        = new JRadioButton("По кругу");
        toSquareRadius  = new JRadioButton("По квадрату с закругленными краями");
        toEight         = new JRadioButton("По восьмерке");

        buttonBox.setLayout(new BoxLayout(buttonBox, BoxLayout.Y_AXIS));
        buttonBox.setBackground(bgColor);

        toHorizontal.setBackground(bgColor);
        toSquare.setBackground(bgColor);
        toSpeed.setBackground(bgColor);
        toCircle.setBackground(bgColor);
        toSquareRadius.setBackground(bgColor);
        toEight.setBackground(bgColor);

        toHorizontal.setActionCommand("horizontal");
        toSquare.setActionCommand("square");
        toSpeed.setActionCommand("speed");
        toCircle.setActionCommand("circle");
        toSquareRadius.setActionCommand("squareRadius");
        toEight.setActionCommand("eight");


        buttonGroup.add(toHorizontal);
        buttonGroup.add(toSquare);
        buttonGroup.add(toSpeed);
        buttonGroup.add(toCircle);
        buttonGroup.add(toSquareRadius);
        buttonGroup.add(toEight);

        buttonBox.add(toHorizontal);
        buttonBox.add(toSquare);
        buttonBox.add(toSpeed);
        buttonBox.add(toCircle);
        buttonBox.add(toSquareRadius);
        buttonBox.add(toEight);

        add(buttonBox);
    }

    public static String getRadioSelected(){
        return buttonGroup.getSelection().getActionCommand();
    }

    private void initPanel() {
        setPreferredSize( new Dimension(APP_WIDTH /3, APP_HEIGHT - 50 ) );
        setBackground( bgColor );
    }
}
